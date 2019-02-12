package org.upstartcommerce.avataxsdk.client

import akka.actor.ActorSystem
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client.internal._

import scala.concurrent.Future
import HttpMethods._
import akka.NotUsed
import akka.http.scaladsl.model.headers
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.unmarshalling.{Unmarshal, Unmarshaller}
import akka.stream.scaladsl.Source
import org.upstartcommerce.avataxsdk.core.data._
import org.upstartcommerce.avataxsdk.core.data.models._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._

trait AvataxClient {
  def accountResetLicenseKey(id: Int,
                             model: ResetLicenseKeyModel): AvataxSimpleCall[LicenseKeyModel]

  def listCurrencies(options: QueryOptions): AvataxCollectionCall[CurrencyModel]
}

sealed trait AvataxCall[+A]

/**
  * Simple calls are ones that return pure model, and have no possibility of pagination, offset...,
  * and thus streaming makes little sense
  */
sealed trait AvataxSimpleCall[A] extends AvataxCall[A] {
  def apply(): Future[A]
}

/**
  * Enables both batch and streamed calls.
  *
  * Avatax imposes limit on how many resources it can return in one call, and thus it's
  * up to client to split/limit/offset/paginate the requests should one need more than limit.
  * For such cases one can use `stream` method, which does the pagination automatically (based
  * on query options, same as with `Future` methods).
  */
sealed trait AvataxCollectionCall[A] extends AvataxCall[A] {
  def batch(): Future[FetchResult[A]]
  final def apply(): Future[FetchResult[A]] = batch()
  def stream: Source[A, NotUsed]
}

object AvataxClient {
  def apply(base64header: String)(implicit system: ActorSystem,
                                  materializer: ActorMaterializer): AvataxClient = {

    val poolFlow    = HostPool.forUrl("sandbox-rest.avatax.com")
    val requester   = Requester.pooled(poolFlow, 10)
    val credentials = headers.Authorization(GenericHttpCredentials("Basic", base64header))
    import system.dispatcher

    /**
      * Fetches data based on request
      */
    def fetch[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, A]): Future[A] = {
      val resp = requester.request(req)
      resp.flatMap { x =>
        Unmarshal(x).to[A]
      }
    }

    /**
      * Fetches one batch of data based on request
      */
    def batchFetch[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): Future[FetchResult[A]] =
      fetch[FetchResult[A]](req)

    /**
      * Pulls the data continously from source, following next link in resultset each time.
      */
    def continuousStream[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): Source[A, NotUsed] = {
      Source
        .unfoldAsync[Option[HttpRequest], List[A]](Some(req)) {
          case Some(url) =>
            batchFetch[A](url)
              .map {
                case FetchResult(_, values, Some(next)) => Some((Some(url.withUri(next)), values))
                case FetchResult(_, values, None)       => Some((None, values))
              }
          case None => Future.successful(None)
        }
        .flatMapConcat(xs => Source(xs))
    }

    def avataxCollectionCall[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): AvataxCollectionCall[A] =
      new AvataxCollectionCall[A] {
        def batch(): Future[FetchResult[A]] = batchFetch[A](req)
        def stream: Source[A, NotUsed]      = continuousStream[A](req)
      }

    def avataxSimpleCall[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): AvataxSimpleCall[A] =
      new AvataxSimpleCall[A] {
        def apply(): Future[A] = fetch[A](req)
      }

    new AvataxClient {
      def accountResetLicenseKey(id: Int,
                                 model: ResetLicenseKeyModel): AvataxSimpleCall[LicenseKeyModel] = {
        val uri = Uri(s"/api/v2/accounts/$id/resetlicensekey")
        val req = HttpRequest(uri = uri).withMethod(POST).withHeaders(credentials)
        avataxSimpleCall[LicenseKeyModel](req)
      }

      def listCurrencies(options: QueryOptions): AvataxCollectionCall[CurrencyModel] = {
        val uri = Uri("/api/v2/definitions/currencies").withQuery(options.asQuery)
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentials)
        avataxCollectionCall[CurrencyModel](req)
      }
    }
  }
}

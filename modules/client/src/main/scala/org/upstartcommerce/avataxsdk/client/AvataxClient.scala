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
import akka.http.scaladsl.model.headers.{BasicHttpCredentials, GenericHttpCredentials}
import akka.http.scaladsl.unmarshalling.{Unmarshal, Unmarshaller}
import akka.stream.scaladsl.Source
import org.upstartcommerce.avataxsdk.core.data.{FetchResult, FilterAst, QueryOptions}
import org.upstartcommerce.avataxsdk.core.data.models.{AuditEvent, CurrencyModel}
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._
import play.api.libs.json._
import org.upstartcommerce.avataxsdk.client.json._

trait AvataxClient {
  def listCurrencies(options: QueryOptions): AvataxCall[CurrencyModel]
}

sealed trait AvataxCall[A] {
  def batch(): Future[FetchResult[A]]
  final def apply(): Future[FetchResult[A]] = batch()
  def stream: Source[A, NotUsed]
}

object AvataxClient {
  def apply(base64header: String)(implicit system: ActorSystem,
                                  materializer: ActorMaterializer): AvataxClient = {

    val poolFlow  = HostPool.forUrl("sandbox-rest.avatax.com")
    val requester = Requester.pooled(poolFlow, 10)
    import system.dispatcher

    /**
      * Fetches one batch of data based on request
      */
    def batchFetch[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): Future[FetchResult[A]] = {
      val resp = requester.request(req)
      resp.flatMap { x =>
        Unmarshal(x).to[FetchResult[A]]
      }
    }

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

    def avataxCall[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): AvataxCall[A] =
      new AvataxCall[A] {
        def batch(): Future[FetchResult[A]] = batchFetch[A](req)
        def stream: Source[A, NotUsed]    = continuousStream[A](req)
      }

    new AvataxClient {
      def listCurrencies(options: QueryOptions): AvataxCall[CurrencyModel] = {
        val uri         = Uri("/api/v2/definitions/currencies").withQuery(options.asQuery)
        val credentials = headers.Authorization(GenericHttpCredentials("Basic", base64header))
        val req         = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentials)
        avataxCall[CurrencyModel](req)
      }
    }
  }
}

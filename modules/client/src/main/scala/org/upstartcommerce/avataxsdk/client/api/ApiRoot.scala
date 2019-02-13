package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.stream.Materializer
import org.upstartcommerce.avataxsdk.client.internal.Requester
import java.text.{DateFormat, SimpleDateFormat}

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
import akka.http.scaladsl.unmarshalling._
import akka.http.scaladsl.marshalling._
import akka.stream.scaladsl.Source
import org.upstartcommerce.avataxsdk.core.data._
import org.upstartcommerce.avataxsdk.core.data.models._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._
import org.upstartcommerce.avataxsdk.client.api.DefinitionsApi
import org.upstartcommerce.avataxsdk.core.data.enums._
import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._

abstract class ApiRoot(requester: Requester, credentialsHeader: HttpHeader)(implicit system: ActorSystem, materializer: Materializer) {
  val dateFmt = {
    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
  }

  import system.dispatcher

  /**
    * Fetches data based on request
    */
  def fetch[A: Format](req: HttpRequest)(implicit um: Unmarshaller[HttpResponse, A]): Future[A] = {
    val resp = requester.request(req)
    resp.flatMap { x =>
      Unmarshal(x).to[A]
    }
  }

  /**
    * Fetches one batch of data based on request
    */
  def batchFetch[A: Format](req: HttpRequest)(implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): Future[FetchResult[A]] =
    fetch[FetchResult[A]](req)

  /**
    * Pulls the data continously from source, following next link in resultset each time.
    */
  def continuousStream[A: Format](req: HttpRequest)(implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): Source[A, NotUsed] = {
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

  def avataxSimpleCall[A: Format](req: HttpRequest)(implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): AvataxSimpleCall[A] =
    new AvataxSimpleCall[A] {
      def apply(): Future[A] = fetch[A](req)
    }

  def avataxBodyCall[A:Writes, R: Format](req: HttpRequest, body:A)(implicit um: Unmarshaller[HttpResponse, FetchResult[R]]): AvataxSimpleCall[R] =
    new AvataxSimpleCall[R] {
      def apply(): Future[R] = marshal(body).flatMap { ent =>
        val req2 = req.withEntity(ent)
        fetch[R](req2)
      }
    }

  def avataxCollectionCall[A: Format](req: HttpRequest)(implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): AvataxCollectionCall[A] =
    new AvataxCollectionCall[A] {
      def batch(): Future[FetchResult[A]] = batchFetch[A](req)
      def stream: Source[A, NotUsed]      = continuousStream[A](req)
    }

  private def marshal[A: Writes](entity: A):Future[RequestEntity] = {
    Marshal(entity).to[RequestEntity]
  }
}

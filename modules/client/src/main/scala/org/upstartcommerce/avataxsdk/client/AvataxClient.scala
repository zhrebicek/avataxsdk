package org.upstartcommerce.avataxsdk.client

import akka.actor.ActorSystem
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client.internal._

import scala.concurrent.Future
import HttpMethods._
import akka.http.scaladsl.model.headers
import akka.http.scaladsl.model.headers.{BasicHttpCredentials, GenericHttpCredentials}
import akka.http.scaladsl.unmarshalling.Unmarshal
import play.api.libs.json._
import json._
import org.upstartcommerce.avataxsdk.core.data.{FetchResult, QueryOptions}
import org.upstartcommerce.avataxsdk.core.data.models.{AuditEvent, CurrencyModel}
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

trait AvataxClient {
  def listCurrencies(options: QueryOptions): Future[FetchResult[CurrencyModel]]
}

object AvataxClient {
  def apply(base64header: String)(implicit system: ActorSystem,
                                  materializer: ActorMaterializer): AvataxClient = {

    val poolFlow  = HostPool.forUrl("sandbox-rest.avatax.com")
    val requester = Requester.pooled(poolFlow, 10)
    import system.dispatcher

    new AvataxClient {
      def listCurrencies(options: QueryOptions): Future[FetchResult[CurrencyModel]] = {
        val uri         = Uri("/api/v2/definitions/currencies").withQuery(options.asQuery)
        val credentials = headers.Authorization(GenericHttpCredentials("Basic", base64header))
        val req         = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentials)

        val resp = requester.request(req)
        resp.flatMap { x =>
          Unmarshal(x).to[FetchResult[CurrencyModel]]
        }
      }
    }
  }

  implicit class QueryOptionsExt(private val q: QueryOptions) extends AnyVal {
    def asQuery: Query = {
      val params: List[(String, String)] = q.filter.map(x => "$filter" -> x).toList ++
        q.top.map(x => "$top"         -> x.toString).toList ++
        q.skip.map(x => "$skip"       -> x.toString).toList ++
        q.orderBy.map(x => "$orderBy" -> x).toList

      Query(params: _*)
    }
  }
}

package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data._
import org.upstartcommerce.avataxsdk.core.data.models._
import akka.http.scaladsl.model.headers.Authorization

import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

/** /api/v2/filingrequests */
trait FilingRequestsRootApi {
  def query(filingCalendarId:Int, options:FiltrableQueryOptions):AvataxCollectionCall[FilingRequestModel]
}

object FilingRequestsRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): FilingRequestsRootApi =
    new ApiRoot(requester, security) with FilingRequestsRootApi {
      def query(filingCalendarId:Int, options:FiltrableQueryOptions):AvataxCollectionCall[FilingRequestModel] = {
        val uri =
          Uri(s"/api/v2/filingrequests").withQuery(options.asQuery.merge(Query("filingCalendarId" -> filingCalendarId.toString)))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[FilingRequestModel](req)
      }
    }
}
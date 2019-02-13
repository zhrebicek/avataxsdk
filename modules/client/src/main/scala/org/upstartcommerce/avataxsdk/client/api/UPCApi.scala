package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
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

trait UPCRootApi {
  def query(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[UPCModel]
}

object UPCRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): UPCRootApi =
    new ApiRoot(requester, security) with UPCRootApi {
      def query(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[UPCModel] = {
        val uri = Uri(s"/api/v2/upcs")
          .withQuery(include.asQuery.merge(options.asQuery))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[UPCModel](req)
      }
    }
}
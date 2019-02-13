package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data.models._
import akka.http.scaladsl.model.headers.Authorization

import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

trait TaxContentsRootApi {
  def buildFile(model:PointOfSaleDataRequestModel):AvataxSimpleCall[String]
}

object TaxContentsRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): TaxContentsRootApi =
    new ApiRoot(requester, security) with TaxContentsRootApi {
      def buildFile(model:PointOfSaleDataRequestModel):AvataxSimpleCall[String] = {
        val uri = Uri(s"/api/v2/pointsofsaledata/build")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxBodyCall[PointOfSaleDataRequestModel, String](req, model)
      }
    }
}
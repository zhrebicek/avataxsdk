package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.http.scaladsl.model.headers.Authorization
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client.AvataxSimpleCall
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data.models._
import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._
import akka.http.scaladsl.model.headers.Authorization

trait AddressesRootApi {
  def resolve(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String, textCase:String):AvataxSimpleCall[AddressResolutionModel]
  def resolvePost(model:AddressValidationInfo):AvataxSimpleCall[AddressResolutionModel]
}

object AddressesRootApi {
  def apply(requester:Requester, security:Option[Authorization])(implicit system: ActorSystem,
                                  materializer: ActorMaterializer): AddressesRootApi =
    new ApiRoot(requester, security) with AddressesRootApi {
      def resolve(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String, textCase:String):AvataxSimpleCall[AddressResolutionModel] = {
        val uri = Uri(s"/api/v2/addresses/resolve").withQuery(Query(
          "line1" -> line1,
          "line2" -> line2,
          "line3" -> line3,
          "city" -> city,
          "region" -> region,
          "postalCode" -> postalCode,
          "country" -> country,
          "textCase" -> textCase))

        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[AddressResolutionModel](req)
      }

      def resolvePost(model:AddressValidationInfo):AvataxSimpleCall[AddressResolutionModel] = {
        val uri = Uri(s"/api/v2/addresses/resolve")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxBodyCall[AddressValidationInfo, AddressResolutionModel](req, model)
      }
    }
}

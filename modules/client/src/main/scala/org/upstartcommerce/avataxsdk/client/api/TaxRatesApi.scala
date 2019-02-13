package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data.models._
import akka.http.scaladsl.model.headers.Authorization

import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

trait TaxRatesRootApi {
  def byAddress(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String):AvataxSimpleCall[TaxRateModel]
  def byPostalCode(country:String, postalCode:String):AvataxSimpleCall[TaxRateModel]
}

object TaxRatesRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): TaxRatesRootApi =
    new ApiRoot(requester, security) with TaxRatesRootApi {
      def byAddress(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String):AvataxSimpleCall[TaxRateModel] = {
        val uri = Uri(s"/api/v2/taxrates/byaddress")
          .withQuery(Query(
            "line1" -> line1,
            "line2" -> line2,
            "line3" -> line3,
            "city" -> city,
            "region" -> region,
            "postalCode" -> postalCode,
            "country" -> country
          ))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[TaxRateModel](req)
      }

      def byPostalCode(country:String, postalCode:String):AvataxSimpleCall[TaxRateModel] = {
        val uri = Uri(s"/api/v2/taxrates/bypostalcode")
          .withQuery(Query(
            "postalCode" -> postalCode,
            "country" -> country
          ))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[TaxRateModel](req)
      }
    }
}
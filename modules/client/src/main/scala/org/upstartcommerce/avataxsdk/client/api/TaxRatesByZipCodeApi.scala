package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.http.scaladsl.model.headers._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._
import akka.http.scaladsl.model.headers.Authorization

trait TaxRatesByZipCodeRootApi {
  def download(date:Date, region:String):AvataxSimpleCall[String]
}

object TaxRatesByZipCodeRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): TaxRatesByZipCodeRootApi =
    new ApiRoot(requester, security) with TaxRatesByZipCodeRootApi {
      def download(date:Date, region:String):AvataxSimpleCall[String] = {
        val uri = Uri(s"/api/v2/taxratesbyzipcode/download/$date")
          .withQuery(Query("region" -> region))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[String](req)
      }
    }
}

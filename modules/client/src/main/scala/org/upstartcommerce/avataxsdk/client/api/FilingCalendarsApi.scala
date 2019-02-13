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

/** /api/v2/filingcalendars */
trait FilingCalendarsRootApi {
  def loginVerificationRequest(model:LoginVerificationInputModel):AvataxSimpleCall[LoginVerificationOutputModel]
  def loginVerificationStatus(jobId:Int):AvataxSimpleCall[LoginVerificationOutputModel]
  def query(returnCountry:String, returnRegion:String, options:FiltrableQueryOptions):AvataxCollectionCall[FilingCalendarModel]
}

object FilingCalendarsRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): FilingCalendarsRootApi =
    new ApiRoot(requester, security) with FilingCalendarsRootApi {
      def loginVerificationRequest(model:LoginVerificationInputModel):AvataxSimpleCall[LoginVerificationOutputModel] = {
        val uri = Uri(s"/api/v2/filingcalendars/credentials/verify")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxBodyCall[LoginVerificationInputModel, LoginVerificationOutputModel](req, model)
      }

      def loginVerificationStatus(jobId:Int):AvataxSimpleCall[LoginVerificationOutputModel] = {
        val uri = Uri(s"/api/v2/filingcalendars/credentials/$jobId")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[LoginVerificationOutputModel](req)
      }

      def query(returnCountry:String, returnRegion:String, options:FiltrableQueryOptions):AvataxCollectionCall[FilingCalendarModel] = {
        val uri = Uri(s"/api/v2/filingcalendars")
          .withQuery(options.asQuery.merge(Query("returnCountry" -> returnCountry, "returnRegion" -> returnRegion)))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[FilingCalendarModel](req)
      }
    }
}

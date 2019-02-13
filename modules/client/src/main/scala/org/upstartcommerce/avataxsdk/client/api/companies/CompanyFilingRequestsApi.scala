package org.upstartcommerce.avataxsdk.client.api.companies

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.api._
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data._
import org.upstartcommerce.avataxsdk.core.data.models._
import akka.http.scaladsl.model.headers.Authorization

import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

/** /api/v2/companies/$companyId/filingrequests */
trait CompanyFilingRequestsRootApi {
  def forId(filingRequestId:Int): CompanyFilingRequestsApi

  def list(filingCalendarId:Int, options:FiltrableQueryOptions):AvataxCollectionCall[FilingRequestModel]
}

object CompanyFilingRequestsRootApi {
  def apply(requester: Requester, security: Option[Authorization])(companyId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): CompanyFilingRequestsRootApi =
    new ApiRoot(requester, security) with CompanyFilingRequestsRootApi {
      def forId(filingReqId: Int): CompanyFilingRequestsApi = CompanyFilingRequestsApi(requester, security)(companyId, filingReqId)

      def list(filingCalendarId:Int, options:FiltrableQueryOptions):AvataxCollectionCall[FilingRequestModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/filingrequests")
          .withQuery(options.asQuery.merge(Query("filingCalendarId" -> filingCalendarId.toString)))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[FilingRequestModel](req)
      }
    }
}

/** /api/v2/companies/$companyId/filingrequests/$filingRequestId */
trait CompanyFilingRequestsApi {
  def approve:AvataxSimpleCall[FilingRequestModel]
  def cancel:AvataxSimpleCall[FilingRequestModel]
  def get:AvataxSimpleCall[FilingRequestModel]
  def update(model:FilingRequestModel):AvataxSimpleCall[FilingRequestModel]
}
object CompanyFilingRequestsApi {
  def apply(requester: Requester, security: Option[Authorization])(companyId:Int, filingRequestId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): CompanyFilingRequestsApi =
    new ApiRoot(requester, security) with CompanyFilingRequestsApi {
      def approve:AvataxSimpleCall[FilingRequestModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/filingrequests/$filingRequestId/approve")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxSimpleCall[FilingRequestModel](req)
      }

      def cancel:AvataxSimpleCall[FilingRequestModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/filingrequests/$filingRequestId/cancel")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxSimpleCall[FilingRequestModel](req)
      }

      def get:AvataxSimpleCall[FilingRequestModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/filingrequests/$filingRequestId")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[FilingRequestModel](req)
      }

      def update(model:FilingRequestModel):AvataxSimpleCall[FilingRequestModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/filingrequests/$filingRequestId")
        val req = HttpRequest(uri = uri).withMethod(PUT)
        avataxBodyCall[FilingRequestModel, FilingRequestModel](req, model)
      }
    }
}
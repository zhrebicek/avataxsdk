package org.upstartcommerce.avataxsdk.client.api.companies

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
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

/** /api/v2/companies/$companyId/distancethresholds */
trait CompanyDistanceThresholdRootApi {
  def forId(distThreshId:Long): CompanyDistanceThresholdApi

  def create(model:List[CompanyDistanceThresholdModel]):AvataxSimpleCall[List[CompanyDistanceThresholdModel]]
  def list(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CompanyDistanceThresholdModel]
}

object CompanyDistanceThresholdRootApi {
  def apply(requester: Requester, security: Option[Authorization])(companyId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): CompanyDistanceThresholdRootApi =
    new ApiRoot(requester, security) with CompanyDistanceThresholdRootApi {
      def forId(distThreshId: Long): CompanyDistanceThresholdApi = CompanyDistanceThresholdApi(requester, security)(companyId, distThreshId)

      def create(model:List[CompanyDistanceThresholdModel]):AvataxSimpleCall[List[CompanyDistanceThresholdModel]] = {
        val uri = Uri(s"/api/v2/companies/$companyId/distancethresholds")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxBodyCall[List[CompanyDistanceThresholdModel], List[CompanyDistanceThresholdModel]](req, model)
      }

      def list(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CompanyDistanceThresholdModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/distancethresholds").withQuery(include.asQuery.merge(options.asQuery))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[CompanyDistanceThresholdModel](req)
      }
    }
}

/** /api/v2/companies/$companyId/distancethresholds/$distanceThresholdId */
trait CompanyDistanceThresholdApi {
  def delete:AvataxSimpleCall[List[ErrorDetail]]
  def get:AvataxSimpleCall[CompanyDistanceThresholdModel]
  def update(model:CompanyDistanceThresholdModel):AvataxSimpleCall[CompanyDistanceThresholdModel]
}
object CompanyDistanceThresholdApi {
  def apply(requester: Requester, security: Option[Authorization])(companyId:Int, distThreshId:Long)(implicit system: ActorSystem, materializer: ActorMaterializer): CompanyDistanceThresholdApi =
    new ApiRoot(requester, security) with CompanyDistanceThresholdApi {
      def delete:AvataxSimpleCall[List[ErrorDetail]] = {
        val uri = Uri(s"/api/v2/companies/$companyId/distancethresholds/$distThreshId")
        val req = HttpRequest(uri = uri).withMethod(DELETE)
        avataxSimpleCall[List[ErrorDetail]](req)
      }

      def get:AvataxSimpleCall[CompanyDistanceThresholdModel]  = {
        val uri = Uri(s"/api/v2/companies/$companyId/distancethresholds/$distThreshId")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[CompanyDistanceThresholdModel](req)
      }

      def update(model:CompanyDistanceThresholdModel):AvataxSimpleCall[CompanyDistanceThresholdModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/distancethresholds/$distThreshId")
        val req = HttpRequest(uri = uri).withMethod(PUT)
        avataxBodyCall[CompanyDistanceThresholdModel, CompanyDistanceThresholdModel](req, model)
      }
    }
}
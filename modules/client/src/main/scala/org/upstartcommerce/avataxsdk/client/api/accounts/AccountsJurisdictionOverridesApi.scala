package org.upstartcommerce.avataxsdk.client.api.accounts

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._
import akka.http.scaladsl.model.headers.Authorization
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.api._
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data._
import org.upstartcommerce.avataxsdk.core.data.models._
import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

/** /api/v2/accounts/$accountId/jurisdictionoverrides */
trait AccountsJurisdictionOverridesRootApi {
  def forJurisOverrideId(jurisOverrideId:Int): AccountsJurisdictionOverridesApi

  def create(model:List[JurisdictionOverrideModel]):AvataxSimpleCall[List[JurisdictionOverrideModel]]
  def list(include:Include, filter:FiltrableQueryOptions):AvataxCollectionCall[JurisdictionOverrideModel]
}

object AccountsJurisdictionOverridesRootApi {
  def apply(requester: Requester, security: Option[Authorization])(accountId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): AccountsJurisdictionOverridesRootApi =
    new ApiRoot(requester, security) with AccountsJurisdictionOverridesRootApi {
      def forJurisOverrideId(jurisOverrideId:Int): AccountsJurisdictionOverridesApi = AccountsJurisdictionOverridesApi(requester, security)(accountId, jurisOverrideId)

      def create(model:List[JurisdictionOverrideModel]):AvataxSimpleCall[List[JurisdictionOverrideModel]] = {
        val uri = Uri(s"/api/v2/accounts/$accountId/jurisdictionoverrides")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxBodyCall[List[JurisdictionOverrideModel], List[JurisdictionOverrideModel]](req, model)
      }

      def list(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[JurisdictionOverrideModel] = {
        val uri = Uri(s"/api/v2/accounts/$accountId/jurisdictionoverrides")
          .withQuery(include.asQuery.merge(options.asQuery))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[JurisdictionOverrideModel](req)
      }
    }
}

/** /api/v2/accounts/$accountId/jurisdictionoverrides/$jurisId */
trait AccountsJurisdictionOverridesApi {
  def delete:AvataxSimpleCall[List[ErrorDetail]]
  def get(include:Include, options:FiltrableQueryOptions):AvataxSimpleCall[JurisdictionOverrideModel]
  def update(model:JurisdictionOverrideModel):AvataxSimpleCall[JurisdictionOverrideModel]
}
object AccountsJurisdictionOverridesApi {
  def apply(requester: Requester, security: Option[Authorization])(accountId:Int, jurisOverrideId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): AccountsJurisdictionOverridesApi =
    new ApiRoot(requester, security) with AccountsJurisdictionOverridesApi {
      def delete:AvataxSimpleCall[List[ErrorDetail]] = {
        val uri = Uri(s"/api/v2/accounts/$accountId/jurisdictionoverrides/$jurisOverrideId")
        val req = HttpRequest(uri = uri).withMethod(DELETE)
        avataxSimpleCall[List[ErrorDetail]](req)
      }

      def get(include:Include, options:FiltrableQueryOptions):AvataxSimpleCall[JurisdictionOverrideModel] = {
        val uri = Uri(s"/api/v2/accounts/$accountId/jurisdictionoverrides/$jurisOverrideId")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[JurisdictionOverrideModel](req)
      }

      def update(model:JurisdictionOverrideModel):AvataxSimpleCall[JurisdictionOverrideModel] = {
        val uri = Uri(s"/api/v2/accounts/$accountId/jurisdictionoverrides/$jurisOverrideId")
        val req = HttpRequest(uri = uri).withMethod(PUT)
        avataxBodyCall[JurisdictionOverrideModel, JurisdictionOverrideModel](req, model)
      }
    }
}

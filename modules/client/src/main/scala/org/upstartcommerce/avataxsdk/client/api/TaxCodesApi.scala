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

trait TaxCodesRootApi {
  def forId(taxCodeId:Int): TaxCodesApi

  def query(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[TaxCodeModel]
}

object TaxCodesRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): TaxCodesRootApi =
    new ApiRoot(requester, security) with TaxCodesRootApi {
      def forId(taxCodeId: Int): TaxCodesApi = TaxCodesApi(requester, security)(taxCodeId)

      def query(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[TaxCodeModel] = {
        val uri = Uri(s"/api/v2/taxcodes")
          .withQuery(include.asQuery.merge(options.asQuery))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[TaxCodeModel](req)
      }
    }
}

trait TaxCodesApi {}
object TaxCodesApi {
  def apply(requester: Requester, security: Option[Authorization])(taxCodeId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): TaxCodesApi =
    new ApiRoot(requester, security) with TaxCodesApi {}
}
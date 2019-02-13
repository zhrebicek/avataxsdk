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

trait BatchesRootApi {
  def query(include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[BatchModel]
}

object BatchesRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): BatchesRootApi =
    new ApiRoot(requester, security) with BatchesRootApi {
      def query(include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[BatchModel] = {
        val uri = Uri(s"/api/v2/batches").withQuery(include.asQuery.merge(options.asQuery))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[BatchModel](req)
      }
    }
}

trait CompanyBatchesRootApi {
  def forBatchId(id:Int): CompanyBatchesApi

  def create(model:List[BatchModel]):AvataxSimpleCall[List[BatchModel]]
  def list(include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[BatchModel]
}

object CompanyBatchesRootApi {
  def apply(requester: Requester, security: Option[Authorization])(companyId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): CompanyBatchesRootApi =
    new ApiRoot(requester, security) with CompanyBatchesRootApi {
      def forBatchId(id: Int): CompanyBatchesApi = CompanyBatchesApi(requester, security)(companyId, id)

      def create(model:List[BatchModel]):AvataxSimpleCall[List[BatchModel]] = {
        val uri = Uri(s"/api/v2/companies/$companyId/batches")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxBodyCall[List[BatchModel], List[BatchModel]](req, model)
      }

      def list(include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[BatchModel] = {
        val uri =
          Uri(s"/api/v2/companies/$companyId/batches").withQuery(include.asQuery.merge(options.asQuery))
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[BatchModel](req)
      }
    }
}

trait CompanyBatchesApi {
  def delete:AvataxSimpleCall[List[ErrorDetail]]
  def download(id:Int):AvataxSimpleCall[String]
  def get:AvataxSimpleCall[BatchModel]
}
object CompanyBatchesApi {
  def apply(requester: Requester, security: Option[Authorization])(companyId:Int, batchId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): CompanyBatchesApi =
    new ApiRoot(requester, security) with CompanyBatchesApi {
      def delete:AvataxSimpleCall[List[ErrorDetail]] = {
        val uri = Uri(s"/api/v2/companies/$companyId/batches/$batchId")
        val req = HttpRequest(uri = uri).withMethod(DELETE)
        avataxSimpleCall[List[ErrorDetail]](req)
      }

      def download(id:Int):AvataxSimpleCall[String] = {
        val uri = Uri(s"/api/v2/companies/$companyId/batches/$batchId/files/$id/attachment")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[String](req)
      }

      def get:AvataxSimpleCall[BatchModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/batches/$batchId")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[BatchModel](req)
      }
    }
}
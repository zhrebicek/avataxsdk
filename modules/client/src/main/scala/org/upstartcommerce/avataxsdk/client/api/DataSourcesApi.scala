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

/** /api/v2/datasources */
trait DataSourcesRootApi {
  def forDataSourceId(dataSourceId:Int): DataSourcesApi

  def query(options:FiltrableQueryOptions):AvataxCollectionCall[DataSourceModel]
}

object DataSourcesRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): DataSourcesRootApi =
    new ApiRoot(requester, security) with DataSourcesRootApi {
      def forDataSourceId(dataSourceId: Int): DataSourcesApi = DataSourcesApi(requester, security)(dataSourceId)

      def query(options:FiltrableQueryOptions):AvataxCollectionCall[DataSourceModel] = {
        val uri = Uri(s"/api/v2/datasources").withQuery(options.asQuery)
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxCollectionCall[DataSourceModel](req)
      }
    }
}

/** /api/v2/datasources/$dataSourceId */
trait DataSourcesApi {}
object DataSourcesApi {
  def apply(requester: Requester, security: Option[Authorization])(dataSourceId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): DataSourcesApi =
    new ApiRoot(requester, security) with DataSourcesApi {}
}
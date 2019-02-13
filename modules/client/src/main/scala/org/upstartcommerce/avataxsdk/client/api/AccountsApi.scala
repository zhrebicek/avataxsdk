package org.upstartcommerce.avataxsdk.client.api

import java.text.{DateFormat, SimpleDateFormat}

import akka.actor.ActorSystem
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client.internal._

import scala.concurrent.Future
import HttpMethods._
import akka.NotUsed
import akka.http.scaladsl.model.headers
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.unmarshalling._
import akka.http.scaladsl.marshalling._
import akka.stream.scaladsl.Source
import org.upstartcommerce.avataxsdk.core.data._
import org.upstartcommerce.avataxsdk.core.data.models._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._
import org.upstartcommerce.avataxsdk.core.data.enums._
import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._

trait AccountsRootApi {
  def forAccount(accountId:Int):AccountsApi

  def query(include: Include, options: FiltrableQueryOptions): AvataxCollectionCall[AccountModel]
}

object AccountsRootApi {
  def apply(requester: Requester, credentialsHeader: HttpHeader)(implicit system: ActorSystem,
                                                                                 materializer: ActorMaterializer): AccountsRootApi =
    new ApiRoot(requester, credentialsHeader) with AccountsRootApi {
      def forAccount(accountId: Int): AccountsApi = AccountsApi(requester, credentialsHeader)(accountId)

      def query(include: Include, options: FiltrableQueryOptions): AvataxCollectionCall[AccountModel] = {
        val uri = Uri(s"/api/v2/accounts").withQuery(include.asQuery.merge(options.asQuery))
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentialsHeader)
        avataxCollectionCall[AccountModel](req)
      }
    }
}

trait AccountsApi {
  def resetLicenseKey(model: ResetLicenseKeyModel): AvataxSimpleCall[LicenseKeyModel]
  def activate(model: ActivateAccountModel): AvataxSimpleCall[AccountModel]
  def audit(start: Date, end: Date, options: BasicQueryOptions): AvataxCollectionCall[AuditModel]
  def get(include: Include): AvataxSimpleCall[AccountModel]
  def getConfiguration: AvataxSimpleCall[List[AccountConfigurationModel]]
}

object AccountsApi {
  def apply(requester: Requester, credentialsHeader: HttpHeader)(accountId: Int)(implicit system: ActorSystem,
                                                                                 materializer: ActorMaterializer): AccountsApi =
    new ApiRoot(requester, credentialsHeader) with AccountsApi {
      def resetLicenseKey(model: ResetLicenseKeyModel): AvataxSimpleCall[LicenseKeyModel] = {
        val uri = Uri(s"/api/v2/accounts/$accountId/resetlicensekey")
        val req = HttpRequest(uri = uri).withMethod(POST).withHeaders(credentialsHeader)
        avataxBodyCall[ResetLicenseKeyModel, LicenseKeyModel](req, model)
      }

      def activate(model: ActivateAccountModel): AvataxSimpleCall[AccountModel] = {
        val uri = Uri(s"/api/v2/accounts/$accountId/activate")
        val req = HttpRequest(uri = uri).withMethod(POST).withHeaders(credentialsHeader)
        avataxBodyCall[ActivateAccountModel, AccountModel](req, model)
      }

      def audit(start: Date, end: Date, options: BasicQueryOptions): AvataxCollectionCall[AuditModel] = {
        val uri =
          Uri(s"/api/v2/accounts/$accountId/audit").withQuery(options.asQuery.and("start", dateFmt.format(start)).and("end", dateFmt.format(end)))
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentialsHeader)
        avataxCollectionCall[AuditModel](req)
      }

      def get(include: Include): AvataxSimpleCall[AccountModel] = {
        val uri = Uri(s"/api/v2/accounts/$accountId").withQuery(include.asQuery)
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentialsHeader)
        avataxSimpleCall[AccountModel](req)
      }

      def getConfiguration: AvataxSimpleCall[List[AccountConfigurationModel]] = {
        val uri = Uri(s"/api/v2/accounts/$accountId/configuration")
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentialsHeader)
        avataxSimpleCall[List[AccountConfigurationModel]](req)
      }
    }
}

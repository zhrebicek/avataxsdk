package org.upstartcommerce.avataxsdk.client.api.companies

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.api.ApiRoot
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data._
import org.upstartcommerce.avataxsdk.core.data.models._
import org.upstartcommerce.avataxsdk.json._
import akka.http.scaladsl.model.headers.Authorization
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

/** api/v2/companies/$companyId/customers/$customerCode/certexpressinvites */
trait CompanyCustomerCertExpressInvitationRootApi {
  def forId(certExpressId:Int): CompanyCustomerCertExpressInvitationApi

  def create(model:List[CreateCertExpressInvitationModel]):AvataxSimpleCall[List[CertExpressInvitationStatusModel]]
}

object CompanyCustomerCertExpressInvitationRootApi {
  def apply(requester: Requester, security: Option[Authorization])(companyId:Int, customerCode:String)(implicit system: ActorSystem, materializer: ActorMaterializer): CompanyCustomerCertExpressInvitationRootApi =
    new ApiRoot(requester, security) with CompanyCustomerCertExpressInvitationRootApi {
      def forId(certExpressId:Int): CompanyCustomerCertExpressInvitationApi =
        CompanyCustomerCertExpressInvitationApi(requester, security)(companyId, customerCode, certExpressId)

      def create(model:List[CreateCertExpressInvitationModel]):AvataxSimpleCall[List[CertExpressInvitationStatusModel]] = {
        val uri = Uri(s"/api/v2/companies/$companyId/customers/$customerCode/certexpressinvites}")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxBodyCall[List[CreateCertExpressInvitationModel], List[CertExpressInvitationStatusModel]](req, model)
      }
    }
}


/** api/v2/companies/$companyId/customers/$customerCode/certexpressinvites/$id */
trait CompanyCustomerCertExpressInvitationApi {
  def get(include:Include):AvataxSimpleCall[CertExpressInvitationModel]
}

object CompanyCustomerCertExpressInvitationApi {
  def apply(requester: Requester, security: Option[Authorization])(companyId:Int, customerCode:String, certExpressId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): CompanyCustomerCertExpressInvitationApi =
    new ApiRoot(requester, security) with CompanyCustomerCertExpressInvitationApi {
      def get(include:Include):AvataxSimpleCall[CertExpressInvitationModel] = {
        val uri = Uri(s"/api/v2/companies/$companyId/customers/$customerCode/certexpressinvites/$certExpressId")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[CertExpressInvitationModel](req)
      }
    }
}


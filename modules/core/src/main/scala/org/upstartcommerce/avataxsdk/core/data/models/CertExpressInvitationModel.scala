package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CertExpressInvitationModel(id:Option[Int] = None, companyId:Option[Int] = None, recipient:Option[String] = None, customerCode:Option[String] = None, customer:Option[CustomerModel] = None, coverLetter:Option[CoverLetterModel] = None, emailStatus:Option[String] = None, coverLettersOnly:Option[Boolean] = None, exposureZones:Option[List[Int]] = None, exemptReasons:Option[List[Int]] = None, deliveryMethod:Option[CertificateRequestDeliveryMethod] = None, message:Option[String] = None, date:Option[Date] = None, requestLink:Option[String] = None) {
  lazy val exposureZonesRaw:List[Int] = exposureZones.getOrElse(List.empty)
  lazy val exemptReasonsRaw:List[Int] = exemptReasons.getOrElse(List.empty)
  def withId(value:Int):CertExpressInvitationModel = copy(id = Some(value))
  def withCompanyId(value:Int):CertExpressInvitationModel = copy(companyId = Some(value))
  def withRecipient(value:String):CertExpressInvitationModel = copy(recipient = Some(value))
  def withCustomerCode(value:String):CertExpressInvitationModel = copy(customerCode = Some(value))
  def withCustomer(value:CustomerModel):CertExpressInvitationModel = copy(customer = Some(value))
  def withCoverLetter(value:CoverLetterModel):CertExpressInvitationModel = copy(coverLetter = Some(value))
  def withEmailStatus(value:String):CertExpressInvitationModel = copy(emailStatus = Some(value))
  def withCoverLettersOnly(value:Boolean):CertExpressInvitationModel = copy(coverLettersOnly = Some(value))
  def withExposureZones(value:List[Int]):CertExpressInvitationModel = copy(exposureZones = Some(value))
  def withExemptReasons(value:List[Int]):CertExpressInvitationModel = copy(exemptReasons = Some(value))
  def withDeliveryMethod(value:CertificateRequestDeliveryMethod):CertExpressInvitationModel = copy(deliveryMethod = Some(value))
  def withMessage(value:String):CertExpressInvitationModel = copy(message = Some(value))
  def withDate(value:Date):CertExpressInvitationModel = copy(date = Some(value))
  def withRequestLink(value:String):CertExpressInvitationModel = copy(requestLink = Some(value))
}
  
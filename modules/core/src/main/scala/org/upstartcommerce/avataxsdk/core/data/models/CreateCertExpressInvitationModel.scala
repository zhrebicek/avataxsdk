package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CreateCertExpressInvitationModel(recipient:Option[String] = None, coverLetterTitle:Option[String] = None, exposureZones:Option[List[Int]] = None, exemptReasons:Option[List[Int]] = None, deliveryMethod:Option[CertificateRequestDeliveryMethod] = None) {
  lazy val exposureZonesRaw:List[Int] = exposureZones.getOrElse(List.empty)
  lazy val exemptReasonsRaw:List[Int] = exemptReasons.getOrElse(List.empty)
  def withRecipient(value:String):CreateCertExpressInvitationModel = copy(recipient = Some(value))
  def withCoverLetterTitle(value:String):CreateCertExpressInvitationModel = copy(coverLetterTitle = Some(value))
  def withExposureZones(value:List[Int]):CreateCertExpressInvitationModel = copy(exposureZones = Some(value))
  def withExemptReasons(value:List[Int]):CreateCertExpressInvitationModel = copy(exemptReasons = Some(value))
  def withDeliveryMethod(value:CertificateRequestDeliveryMethod):CreateCertExpressInvitationModel = copy(deliveryMethod = Some(value))
}
  
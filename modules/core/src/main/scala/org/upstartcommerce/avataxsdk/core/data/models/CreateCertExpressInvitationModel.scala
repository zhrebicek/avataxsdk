package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CreateCertExpressInvitationModel(recipient:Option[String] = None, coverLetterTitle:Option[String] = None, exposureZones:List[Int] = List.empty, exemptReasons:List[Int] = List.empty, deliveryMethod:Option[CertificateRequestDeliveryMethod] = None) {
  def withRecipient(value:String):CreateCertExpressInvitationModel = copy(recipient = Some(value))
  def withCoverLetterTitle(value:String):CreateCertExpressInvitationModel = copy(coverLetterTitle = Some(value))
  def withExposureZones(value:List[Int]):CreateCertExpressInvitationModel = copy(exposureZones = value)
  def withExemptReasons(value:List[Int]):CreateCertExpressInvitationModel = copy(exemptReasons = value)
  def withDeliveryMethod(value:CertificateRequestDeliveryMethod):CreateCertExpressInvitationModel = copy(deliveryMethod = Some(value))
}
  
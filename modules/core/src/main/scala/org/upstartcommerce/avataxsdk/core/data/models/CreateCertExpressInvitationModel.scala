package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CreateCertExpressInvitationModel(recipient:Option[String] = None, coverLetterTitle:Option[String] = None, exposureZones:Option[List[Int]] = None, exemptReasons:Option[List[Int]] = None, deliveryMethod:Option[CertificateRequestDeliveryMethod] = None)
  
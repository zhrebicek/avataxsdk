package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CertExpressInvitationModel(id:Option[Int] = None, companyId:Option[Int] = None, recipient:Option[String] = None, customerCode:Option[String] = None, customer:Option[CustomerModel] = None, coverLetter:Option[CoverLetterModel] = None, emailStatus:Option[String] = None, coverLettersOnly:Option[Boolean] = None, exposureZones:Option[List[Int]] = None, exemptReasons:Option[List[Int]] = None, deliveryMethod:Option[CertificateRequestDeliveryMethod] = None, message:Option[String] = None, date:Option[Date] = None, requestLink:Option[String] = None)
  
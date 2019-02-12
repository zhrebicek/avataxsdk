package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ExemptionStatusModel(status:Option[String] = None, certificate:Option[CertificateModel] = None) {
  def withStatus(value:String):ExemptionStatusModel = copy(status = Some(value))
  def withCertificate(value:CertificateModel):ExemptionStatusModel = copy(certificate = Some(value))
}
  
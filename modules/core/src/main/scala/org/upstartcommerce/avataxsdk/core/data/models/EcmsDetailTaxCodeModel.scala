package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class EcmsDetailTaxCodeModel(exemptCertDetailTaxCodeId:Option[Int] = None, exemptCertDetailId:Option[Int] = None, taxCodeId:Option[Int] = None) {

  def withExemptCertDetailTaxCodeId(value:Int):EcmsDetailTaxCodeModel = copy(exemptCertDetailTaxCodeId = Some(value))
  def withExemptCertDetailId(value:Int):EcmsDetailTaxCodeModel = copy(exemptCertDetailId = Some(value))
  def withTaxCodeId(value:Int):EcmsDetailTaxCodeModel = copy(taxCodeId = Some(value))
}
  
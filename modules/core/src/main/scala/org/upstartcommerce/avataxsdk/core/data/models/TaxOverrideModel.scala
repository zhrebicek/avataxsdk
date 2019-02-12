package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxOverrideModel(`type`:Option[TaxOverrideType] = None, taxAmount:Option[BigDecimal] = None, taxDate:Option[Date] = None, reason:Option[String] = None) {
  def withType(value:TaxOverrideType):TaxOverrideModel = copy(`type` = Some(value))
  def withTaxAmount(value:BigDecimal):TaxOverrideModel = copy(taxAmount = Some(value))
  def withTaxDate(value:Date):TaxOverrideModel = copy(taxDate = Some(value))
  def withReason(value:String):TaxOverrideModel = copy(reason = Some(value))
}
  
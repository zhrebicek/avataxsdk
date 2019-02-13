package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxDetailsByTaxType(taxType:Option[String] = None, totalTaxable:Option[BigDecimal] = None, totalExempt:Option[BigDecimal] = None, totalNonTaxable:Option[BigDecimal] = None, totalTax:Option[BigDecimal] = None) {

  def withTaxType(value:String):TaxDetailsByTaxType = copy(taxType = Some(value))
  def withTotalTaxable(value:BigDecimal):TaxDetailsByTaxType = copy(totalTaxable = Some(value))
  def withTotalExempt(value:BigDecimal):TaxDetailsByTaxType = copy(totalExempt = Some(value))
  def withTotalNonTaxable(value:BigDecimal):TaxDetailsByTaxType = copy(totalNonTaxable = Some(value))
  def withTotalTax(value:BigDecimal):TaxDetailsByTaxType = copy(totalTax = Some(value))
}
  
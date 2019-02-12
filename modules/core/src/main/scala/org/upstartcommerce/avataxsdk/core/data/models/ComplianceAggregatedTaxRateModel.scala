package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ComplianceAggregatedTaxRateModel(rate:Option[BigDecimal] = None, stackRate:Option[BigDecimal] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, taxTypeId:Option[String] = None, rateTypeId:Option[String] = None) {
  def withRate(value:BigDecimal):ComplianceAggregatedTaxRateModel = copy(rate = Some(value))
  def withStackRate(value:BigDecimal):ComplianceAggregatedTaxRateModel = copy(stackRate = Some(value))
  def withEffectiveDate(value:Date):ComplianceAggregatedTaxRateModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):ComplianceAggregatedTaxRateModel = copy(endDate = Some(value))
  def withTaxTypeId(value:String):ComplianceAggregatedTaxRateModel = copy(taxTypeId = Some(value))
  def withRateTypeId(value:String):ComplianceAggregatedTaxRateModel = copy(rateTypeId = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ComplianceTaxRateModel(id:Option[Int] = None, rate:Option[BigDecimal] = None, jurisdictionId:Option[Int] = None, taxRegionId:Option[Int] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, rateTypeId:Option[String] = None, taxTypeId:Option[String] = None, taxName:Option[String] = None, unitOfBasisId:Option[Long] = None, rateTypeTaxTypeMappingId:Option[Int] = None) {

  def withId(value:Int):ComplianceTaxRateModel = copy(id = Some(value))
  def withRate(value:BigDecimal):ComplianceTaxRateModel = copy(rate = Some(value))
  def withJurisdictionId(value:Int):ComplianceTaxRateModel = copy(jurisdictionId = Some(value))
  def withTaxRegionId(value:Int):ComplianceTaxRateModel = copy(taxRegionId = Some(value))
  def withEffectiveDate(value:Date):ComplianceTaxRateModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):ComplianceTaxRateModel = copy(endDate = Some(value))
  def withRateTypeId(value:String):ComplianceTaxRateModel = copy(rateTypeId = Some(value))
  def withTaxTypeId(value:String):ComplianceTaxRateModel = copy(taxTypeId = Some(value))
  def withTaxName(value:String):ComplianceTaxRateModel = copy(taxName = Some(value))
  def withUnitOfBasisId(value:Long):ComplianceTaxRateModel = copy(unitOfBasisId = Some(value))
  def withRateTypeTaxTypeMappingId(value:Int):ComplianceTaxRateModel = copy(rateTypeTaxTypeMappingId = Some(value))
}
  
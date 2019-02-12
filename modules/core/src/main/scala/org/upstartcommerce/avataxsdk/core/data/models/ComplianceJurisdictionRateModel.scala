package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ComplianceJurisdictionRateModel(jurisdictionId:Option[Int] = None, country:Option[String] = None, region:Option[String] = None, name:Option[String] = None, jurisdictionTypeId:Option[String] = None, rate:Option[BigDecimal] = None, rateTypeId:Option[String] = None, taxTypeId:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, stateAssignedCode:Option[String] = None, taxAuthorityId:Option[Int] = None) {
  def withJurisdictionId(value:Int):ComplianceJurisdictionRateModel = copy(jurisdictionId = Some(value))
  def withCountry(value:String):ComplianceJurisdictionRateModel = copy(country = Some(value))
  def withRegion(value:String):ComplianceJurisdictionRateModel = copy(region = Some(value))
  def withName(value:String):ComplianceJurisdictionRateModel = copy(name = Some(value))
  def withJurisdictionTypeId(value:String):ComplianceJurisdictionRateModel = copy(jurisdictionTypeId = Some(value))
  def withRate(value:BigDecimal):ComplianceJurisdictionRateModel = copy(rate = Some(value))
  def withRateTypeId(value:String):ComplianceJurisdictionRateModel = copy(rateTypeId = Some(value))
  def withTaxTypeId(value:String):ComplianceJurisdictionRateModel = copy(taxTypeId = Some(value))
  def withEffectiveDate(value:Date):ComplianceJurisdictionRateModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):ComplianceJurisdictionRateModel = copy(endDate = Some(value))
  def withStateAssignedCode(value:String):ComplianceJurisdictionRateModel = copy(stateAssignedCode = Some(value))
  def withTaxAuthorityId(value:Int):ComplianceJurisdictionRateModel = copy(taxAuthorityId = Some(value))
}
  
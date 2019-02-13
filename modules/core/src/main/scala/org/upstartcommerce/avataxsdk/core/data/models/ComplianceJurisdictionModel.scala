package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ComplianceJurisdictionModel(taxRegionId:Option[Int] = None, stateAssignedCode:Option[String] = None, jurisdictionTypeId:Option[String] = None, name:Option[String] = None, county:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, taxRegionName:Option[String] = None, taxAuthorityId:Option[Int] = None, rates:Option[List[ComplianceAggregatedTaxRateModel]] = None) {
  lazy val ratesRaw:List[ComplianceAggregatedTaxRateModel] = rates.getOrElse(List.empty)
  def withTaxRegionId(value:Int):ComplianceJurisdictionModel = copy(taxRegionId = Some(value))
  def withStateAssignedCode(value:String):ComplianceJurisdictionModel = copy(stateAssignedCode = Some(value))
  def withJurisdictionTypeId(value:String):ComplianceJurisdictionModel = copy(jurisdictionTypeId = Some(value))
  def withName(value:String):ComplianceJurisdictionModel = copy(name = Some(value))
  def withCounty(value:String):ComplianceJurisdictionModel = copy(county = Some(value))
  def withCity(value:String):ComplianceJurisdictionModel = copy(city = Some(value))
  def withRegion(value:String):ComplianceJurisdictionModel = copy(region = Some(value))
  def withCountry(value:String):ComplianceJurisdictionModel = copy(country = Some(value))
  def withTaxRegionName(value:String):ComplianceJurisdictionModel = copy(taxRegionName = Some(value))
  def withTaxAuthorityId(value:Int):ComplianceJurisdictionModel = copy(taxAuthorityId = Some(value))
  def withRates(value:List[ComplianceAggregatedTaxRateModel]):ComplianceJurisdictionModel = copy(rates = Some(value))
}
  
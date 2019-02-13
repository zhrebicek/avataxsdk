package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class JurisdictionModel(code:Option[String] = None, name:Option[String] = None, `type`:Option[JurisdictionType] = None, rate:Option[BigDecimal] = None, salesRate:Option[BigDecimal] = None, signatureCode:Option[String] = None, region:Option[String] = None, useRate:Option[BigDecimal] = None, city:Option[String] = None, county:Option[String] = None, country:Option[String] = None, shortName:Option[String] = None, stateFips:Option[String] = None, countyFips:Option[String] = None, placeFips:Option[String] = None, id:Option[Int] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None) {

  def withCode(value:String):JurisdictionModel = copy(code = Some(value))
  def withName(value:String):JurisdictionModel = copy(name = Some(value))
  def withType(value:JurisdictionType):JurisdictionModel = copy(`type` = Some(value))
  def withRate(value:BigDecimal):JurisdictionModel = copy(rate = Some(value))
  def withSalesRate(value:BigDecimal):JurisdictionModel = copy(salesRate = Some(value))
  def withSignatureCode(value:String):JurisdictionModel = copy(signatureCode = Some(value))
  def withRegion(value:String):JurisdictionModel = copy(region = Some(value))
  def withUseRate(value:BigDecimal):JurisdictionModel = copy(useRate = Some(value))
  def withCity(value:String):JurisdictionModel = copy(city = Some(value))
  def withCounty(value:String):JurisdictionModel = copy(county = Some(value))
  def withCountry(value:String):JurisdictionModel = copy(country = Some(value))
  def withShortName(value:String):JurisdictionModel = copy(shortName = Some(value))
  def withStateFips(value:String):JurisdictionModel = copy(stateFips = Some(value))
  def withCountyFips(value:String):JurisdictionModel = copy(countyFips = Some(value))
  def withPlaceFips(value:String):JurisdictionModel = copy(placeFips = Some(value))
  def withId(value:Int):JurisdictionModel = copy(id = Some(value))
  def withEffectiveDate(value:Date):JurisdictionModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):JurisdictionModel = copy(endDate = Some(value))
}
  
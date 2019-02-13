package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxRegionModel(id:Option[Int] = None, code:Option[String] = None, name:Option[String] = None, county:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, serCode:Option[String] = None, signatureCode:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, isAcm:Option[Boolean] = None, isSst:Option[Boolean] = None) {

  def withId(value:Int):TaxRegionModel = copy(id = Some(value))
  def withCode(value:String):TaxRegionModel = copy(code = Some(value))
  def withName(value:String):TaxRegionModel = copy(name = Some(value))
  def withCounty(value:String):TaxRegionModel = copy(county = Some(value))
  def withCity(value:String):TaxRegionModel = copy(city = Some(value))
  def withRegion(value:String):TaxRegionModel = copy(region = Some(value))
  def withCountry(value:String):TaxRegionModel = copy(country = Some(value))
  def withSerCode(value:String):TaxRegionModel = copy(serCode = Some(value))
  def withSignatureCode(value:String):TaxRegionModel = copy(signatureCode = Some(value))
  def withEffectiveDate(value:Date):TaxRegionModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):TaxRegionModel = copy(endDate = Some(value))
  def withIsAcm(value:Boolean):TaxRegionModel = copy(isAcm = Some(value))
  def withIsSst(value:Boolean):TaxRegionModel = copy(isSst = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PostalCodeModel(country:Option[String] = None, region:Option[String] = None, taxRegionId:Option[Int] = None, effDate:Option[Date] = None, endDate:Option[Date] = None, postalCode:Option[String] = None) {
  def withCountry(value:String):PostalCodeModel = copy(country = Some(value))
  def withRegion(value:String):PostalCodeModel = copy(region = Some(value))
  def withTaxRegionId(value:Int):PostalCodeModel = copy(taxRegionId = Some(value))
  def withEffDate(value:Date):PostalCodeModel = copy(effDate = Some(value))
  def withEndDate(value:Date):PostalCodeModel = copy(endDate = Some(value))
  def withPostalCode(value:String):PostalCodeModel = copy(postalCode = Some(value))
}
  
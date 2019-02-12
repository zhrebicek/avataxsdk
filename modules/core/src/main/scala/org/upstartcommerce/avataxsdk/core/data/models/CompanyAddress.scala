package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CompanyAddress(line:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, postalCode:Option[String] = None) {
  def withLine(value:String):CompanyAddress = copy(line = Some(value))
  def withCity(value:String):CompanyAddress = copy(city = Some(value))
  def withRegion(value:String):CompanyAddress = copy(region = Some(value))
  def withCountry(value:String):CompanyAddress = copy(country = Some(value))
  def withPostalCode(value:String):CompanyAddress = copy(postalCode = Some(value))
}
  
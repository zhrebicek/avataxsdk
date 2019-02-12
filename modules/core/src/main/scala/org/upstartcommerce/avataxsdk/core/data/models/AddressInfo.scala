package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddressInfo(line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, postalCode:Option[String] = None, latitude:Option[BigDecimal] = None, longitude:Option[BigDecimal] = None) {
  def withLine1(value:String):AddressInfo = copy(line1 = Some(value))
  def withLine2(value:String):AddressInfo = copy(line2 = Some(value))
  def withLine3(value:String):AddressInfo = copy(line3 = Some(value))
  def withCity(value:String):AddressInfo = copy(city = Some(value))
  def withRegion(value:String):AddressInfo = copy(region = Some(value))
  def withCountry(value:String):AddressInfo = copy(country = Some(value))
  def withPostalCode(value:String):AddressInfo = copy(postalCode = Some(value))
  def withLatitude(value:BigDecimal):AddressInfo = copy(latitude = Some(value))
  def withLongitude(value:BigDecimal):AddressInfo = copy(longitude = Some(value))
}
  
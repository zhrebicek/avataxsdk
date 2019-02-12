package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ValidatedAddressInfo(addressType:Option[String] = None, line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, postalCode:Option[String] = None, latitude:Option[BigDecimal] = None, longitude:Option[BigDecimal] = None) {
  def withAddressType(value:String):ValidatedAddressInfo = copy(addressType = Some(value))
  def withLine1(value:String):ValidatedAddressInfo = copy(line1 = Some(value))
  def withLine2(value:String):ValidatedAddressInfo = copy(line2 = Some(value))
  def withLine3(value:String):ValidatedAddressInfo = copy(line3 = Some(value))
  def withCity(value:String):ValidatedAddressInfo = copy(city = Some(value))
  def withRegion(value:String):ValidatedAddressInfo = copy(region = Some(value))
  def withCountry(value:String):ValidatedAddressInfo = copy(country = Some(value))
  def withPostalCode(value:String):ValidatedAddressInfo = copy(postalCode = Some(value))
  def withLatitude(value:BigDecimal):ValidatedAddressInfo = copy(latitude = Some(value))
  def withLongitude(value:BigDecimal):ValidatedAddressInfo = copy(longitude = Some(value))
}
  
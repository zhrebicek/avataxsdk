package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddressValidationInfo(textCase:Option[TextCase] = None, line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, postalCode:Option[String] = None, latitude:Option[BigDecimal] = None, longitude:Option[BigDecimal] = None) {

  def withTextCase(value:TextCase):AddressValidationInfo = copy(textCase = Some(value))
  def withLine1(value:String):AddressValidationInfo = copy(line1 = Some(value))
  def withLine2(value:String):AddressValidationInfo = copy(line2 = Some(value))
  def withLine3(value:String):AddressValidationInfo = copy(line3 = Some(value))
  def withCity(value:String):AddressValidationInfo = copy(city = Some(value))
  def withRegion(value:String):AddressValidationInfo = copy(region = Some(value))
  def withCountry(value:String):AddressValidationInfo = copy(country = Some(value))
  def withPostalCode(value:String):AddressValidationInfo = copy(postalCode = Some(value))
  def withLatitude(value:BigDecimal):AddressValidationInfo = copy(latitude = Some(value))
  def withLongitude(value:BigDecimal):AddressValidationInfo = copy(longitude = Some(value))
}
  
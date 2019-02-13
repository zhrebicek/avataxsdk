package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CustomerModel(id:Option[Int] = None, companyId:Option[Int] = None, customerCode:Option[String] = None, alternateId:Option[String] = None, name:Option[String] = None, attnName:Option[String] = None, line1:Option[String] = None, line2:Option[String] = None, city:Option[String] = None, postalCode:Option[String] = None, phoneNumber:Option[String] = None, faxNumber:Option[String] = None, emailAddress:Option[String] = None, contactName:Option[String] = None, lastTransaction:Option[Date] = None, createdDate:Option[Date] = None, modifiedDate:Option[Date] = None, country:Option[String] = None, region:Option[String] = None, isBill:Option[Boolean] = None, isShip:Option[Boolean] = None, taxpayerIdNumber:Option[String] = None, certificates:Option[List[CertificateModel]] = None, customFields:Option[List[CustomFieldModel]] = None, exposureZones:Option[List[ExposureZoneModel]] = None, shipTos:Option[List[CustomerModel]] = None) {
  lazy val certificatesRaw:List[CertificateModel] = certificates.getOrElse(List.empty)
  lazy val customFieldsRaw:List[CustomFieldModel] = customFields.getOrElse(List.empty)
  lazy val exposureZonesRaw:List[ExposureZoneModel] = exposureZones.getOrElse(List.empty)
  lazy val shipTosRaw:List[CustomerModel] = shipTos.getOrElse(List.empty)
  def withId(value:Int):CustomerModel = copy(id = Some(value))
  def withCompanyId(value:Int):CustomerModel = copy(companyId = Some(value))
  def withCustomerCode(value:String):CustomerModel = copy(customerCode = Some(value))
  def withAlternateId(value:String):CustomerModel = copy(alternateId = Some(value))
  def withName(value:String):CustomerModel = copy(name = Some(value))
  def withAttnName(value:String):CustomerModel = copy(attnName = Some(value))
  def withLine1(value:String):CustomerModel = copy(line1 = Some(value))
  def withLine2(value:String):CustomerModel = copy(line2 = Some(value))
  def withCity(value:String):CustomerModel = copy(city = Some(value))
  def withPostalCode(value:String):CustomerModel = copy(postalCode = Some(value))
  def withPhoneNumber(value:String):CustomerModel = copy(phoneNumber = Some(value))
  def withFaxNumber(value:String):CustomerModel = copy(faxNumber = Some(value))
  def withEmailAddress(value:String):CustomerModel = copy(emailAddress = Some(value))
  def withContactName(value:String):CustomerModel = copy(contactName = Some(value))
  def withLastTransaction(value:Date):CustomerModel = copy(lastTransaction = Some(value))
  def withCreatedDate(value:Date):CustomerModel = copy(createdDate = Some(value))
  def withModifiedDate(value:Date):CustomerModel = copy(modifiedDate = Some(value))
  def withCountry(value:String):CustomerModel = copy(country = Some(value))
  def withRegion(value:String):CustomerModel = copy(region = Some(value))
  def withIsBill(value:Boolean):CustomerModel = copy(isBill = Some(value))
  def withIsShip(value:Boolean):CustomerModel = copy(isShip = Some(value))
  def withTaxpayerIdNumber(value:String):CustomerModel = copy(taxpayerIdNumber = Some(value))
  def withCertificates(value:List[CertificateModel]):CustomerModel = copy(certificates = Some(value))
  def withCustomFields(value:List[CustomFieldModel]):CustomerModel = copy(customFields = Some(value))
  def withExposureZones(value:List[ExposureZoneModel]):CustomerModel = copy(exposureZones = Some(value))
  def withShipTos(value:List[CustomerModel]):CustomerModel = copy(shipTos = Some(value))
}
  
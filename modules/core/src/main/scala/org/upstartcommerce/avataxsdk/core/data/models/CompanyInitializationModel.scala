package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CompanyInitializationModel(name:Option[String] = None, companyCode:Option[String] = None, vatRegistrationId:Option[String] = None, taxpayerIdNumber:Option[String] = None, line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, postalCode:Option[String] = None, country:Option[String] = None, firstName:Option[String] = None, lastName:Option[String] = None, title:Option[String] = None, email:Option[String] = None, phoneNumber:Option[String] = None, mobileNumber:Option[String] = None, faxNumber:Option[String] = None, parentCompanyId:Option[Int] = None) {
  def withName(value:String):CompanyInitializationModel = copy(name = Some(value))
  def withCompanyCode(value:String):CompanyInitializationModel = copy(companyCode = Some(value))
  def withVatRegistrationId(value:String):CompanyInitializationModel = copy(vatRegistrationId = Some(value))
  def withTaxpayerIdNumber(value:String):CompanyInitializationModel = copy(taxpayerIdNumber = Some(value))
  def withLine1(value:String):CompanyInitializationModel = copy(line1 = Some(value))
  def withLine2(value:String):CompanyInitializationModel = copy(line2 = Some(value))
  def withLine3(value:String):CompanyInitializationModel = copy(line3 = Some(value))
  def withCity(value:String):CompanyInitializationModel = copy(city = Some(value))
  def withRegion(value:String):CompanyInitializationModel = copy(region = Some(value))
  def withPostalCode(value:String):CompanyInitializationModel = copy(postalCode = Some(value))
  def withCountry(value:String):CompanyInitializationModel = copy(country = Some(value))
  def withFirstName(value:String):CompanyInitializationModel = copy(firstName = Some(value))
  def withLastName(value:String):CompanyInitializationModel = copy(lastName = Some(value))
  def withTitle(value:String):CompanyInitializationModel = copy(title = Some(value))
  def withEmail(value:String):CompanyInitializationModel = copy(email = Some(value))
  def withPhoneNumber(value:String):CompanyInitializationModel = copy(phoneNumber = Some(value))
  def withMobileNumber(value:String):CompanyInitializationModel = copy(mobileNumber = Some(value))
  def withFaxNumber(value:String):CompanyInitializationModel = copy(faxNumber = Some(value))
  def withParentCompanyId(value:Int):CompanyInitializationModel = copy(parentCompanyId = Some(value))
}
  
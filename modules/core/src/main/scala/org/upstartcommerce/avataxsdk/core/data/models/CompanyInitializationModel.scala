package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CompanyInitializationModel(name:Option[String] = None, companyCode:Option[String] = None, vatRegistrationId:Option[String] = None, taxpayerIdNumber:Option[String] = None, line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, postalCode:Option[String] = None, country:Option[String] = None, firstName:Option[String] = None, lastName:Option[String] = None, title:Option[String] = None, email:Option[String] = None, phoneNumber:Option[String] = None, mobileNumber:Option[String] = None, faxNumber:Option[String] = None, parentCompanyId:Option[Int] = None)
  
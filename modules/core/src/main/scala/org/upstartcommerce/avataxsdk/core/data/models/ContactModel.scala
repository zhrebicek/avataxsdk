package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ContactModel(id:Option[Int] = None, companyId:Option[Int] = None, contactCode:Option[String] = None, firstName:Option[String] = None, middleName:Option[String] = None, lastName:Option[String] = None, title:Option[String] = None, line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, postalCode:Option[String] = None, country:Option[String] = None, email:Option[String] = None, phone:Option[String] = None, mobile:Option[String] = None, fax:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
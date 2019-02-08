package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UserModel(id:Option[Int] = None, accountId:Option[Int] = None, companyId:Option[Int] = None, userName:Option[String] = None, firstName:Option[String] = None, lastName:Option[String] = None, email:Option[String] = None, postalCode:Option[String] = None, securityRoleId:Option[SecurityRoleId] = None, passwordStatus:Option[PasswordStatusId] = None, isActive:Option[Boolean] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
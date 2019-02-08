package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LoginVerificationInputModel(companyId:Option[Int] = None, accountId:Option[Int] = None, region:Option[String] = None, taxFormCode:Option[String] = None, username:Option[String] = None, password:Option[String] = None, additionalOptions:Option[Map[String, String]] = None, bulkRequestId:Option[Int] = None, priority:Option[Int] = None)
  
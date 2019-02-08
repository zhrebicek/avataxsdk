package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PingResultModel(version:Option[String] = None, authenticated:Option[Boolean] = None, authenticationType:Option[AuthenticationTypeId] = None, authenticatedUserName:Option[String] = None, authenticatedUserId:Option[Int] = None, authenticatedAccountId:Option[Int] = None, crmid:Option[String] = None)
  
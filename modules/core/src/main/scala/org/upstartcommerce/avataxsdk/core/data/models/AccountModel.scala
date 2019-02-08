package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AccountModel(id:Option[Int] = None, crmid:Option[String] = None, name:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, accountStatusId:Option[AccountStatusId] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, subscriptions:Option[List[SubscriptionModel]] = None, users:Option[List[UserModel]] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SubscriptionModel(id:Option[Int] = None, accountId:Option[Int] = None, subscriptionTypeId:Option[Int] = None, subscriptionDescription:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
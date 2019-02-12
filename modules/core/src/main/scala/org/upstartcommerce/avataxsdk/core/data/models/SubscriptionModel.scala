package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SubscriptionModel(id:Option[Int] = None, accountId:Option[Int] = None, subscriptionTypeId:Option[Int] = None, subscriptionDescription:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {
  def withId(value:Int):SubscriptionModel = copy(id = Some(value))
  def withAccountId(value:Int):SubscriptionModel = copy(accountId = Some(value))
  def withSubscriptionTypeId(value:Int):SubscriptionModel = copy(subscriptionTypeId = Some(value))
  def withSubscriptionDescription(value:String):SubscriptionModel = copy(subscriptionDescription = Some(value))
  def withEffectiveDate(value:Date):SubscriptionModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):SubscriptionModel = copy(endDate = Some(value))
  def withCreatedDate(value:Date):SubscriptionModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):SubscriptionModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):SubscriptionModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):SubscriptionModel = copy(modifiedUserId = Some(value))
}
  
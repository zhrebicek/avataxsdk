package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AccountModel(id:Option[Int] = None, crmid:Option[String] = None, name:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, accountStatusId:Option[AccountStatusId] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, subscriptions:Option[List[SubscriptionModel]] = None, users:Option[List[UserModel]] = None) {
  lazy val subscriptionsRaw:List[SubscriptionModel] = subscriptions.getOrElse(List.empty)
  lazy val usersRaw:List[UserModel] = users.getOrElse(List.empty)
  def withId(value:Int):AccountModel = copy(id = Some(value))
  def withCrmid(value:String):AccountModel = copy(crmid = Some(value))
  def withName(value:String):AccountModel = copy(name = Some(value))
  def withEffectiveDate(value:Date):AccountModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):AccountModel = copy(endDate = Some(value))
  def withAccountStatusId(value:AccountStatusId):AccountModel = copy(accountStatusId = Some(value))
  def withCreatedDate(value:Date):AccountModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):AccountModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):AccountModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):AccountModel = copy(modifiedUserId = Some(value))
  def withSubscriptions(value:List[SubscriptionModel]):AccountModel = copy(subscriptions = Some(value))
  def withUsers(value:List[UserModel]):AccountModel = copy(users = Some(value))
}
  
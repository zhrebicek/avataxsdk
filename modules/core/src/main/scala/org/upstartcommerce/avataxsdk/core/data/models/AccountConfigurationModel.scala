package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AccountConfigurationModel(accountId:Option[Int] = None, category:Option[String] = None, name:Option[String] = None, value:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {

  def withAccountId(value:Int):AccountConfigurationModel = copy(accountId = Some(value))
  def withCategory(value:String):AccountConfigurationModel = copy(category = Some(value))
  def withName(value:String):AccountConfigurationModel = copy(name = Some(value))
  def withValue(value:String):AccountConfigurationModel = copy(value = Some(value))
  def withCreatedDate(value:Date):AccountConfigurationModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):AccountConfigurationModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):AccountConfigurationModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):AccountConfigurationModel = copy(modifiedUserId = Some(value))
}
  
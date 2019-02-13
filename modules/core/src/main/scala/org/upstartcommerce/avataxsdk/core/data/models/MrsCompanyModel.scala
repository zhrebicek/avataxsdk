package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class MrsCompanyModel(companyId:Option[Int] = None, companyName:Option[String] = None, accountId:Option[Int] = None, accountName:Option[String] = None, tin:Option[String] = None, companyCode:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {

  def withCompanyId(value:Int):MrsCompanyModel = copy(companyId = Some(value))
  def withCompanyName(value:String):MrsCompanyModel = copy(companyName = Some(value))
  def withAccountId(value:Int):MrsCompanyModel = copy(accountId = Some(value))
  def withAccountName(value:String):MrsCompanyModel = copy(accountName = Some(value))
  def withTin(value:String):MrsCompanyModel = copy(tin = Some(value))
  def withCompanyCode(value:String):MrsCompanyModel = copy(companyCode = Some(value))
  def withCreatedDate(value:Date):MrsCompanyModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):MrsCompanyModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):MrsCompanyModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):MrsCompanyModel = copy(modifiedUserId = Some(value))
}
  
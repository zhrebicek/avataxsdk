package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CompanyConfigurationModel(companyId:Option[Int] = None, category:Option[String] = None, name:Option[String] = None, value:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {
  def withCompanyId(value:Int):CompanyConfigurationModel = copy(companyId = Some(value))
  def withCategory(value:String):CompanyConfigurationModel = copy(category = Some(value))
  def withName(value:String):CompanyConfigurationModel = copy(name = Some(value))
  def withValue(value:String):CompanyConfigurationModel = copy(value = Some(value))
  def withCreatedDate(value:Date):CompanyConfigurationModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):CompanyConfigurationModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):CompanyConfigurationModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):CompanyConfigurationModel = copy(modifiedUserId = Some(value))
}
  
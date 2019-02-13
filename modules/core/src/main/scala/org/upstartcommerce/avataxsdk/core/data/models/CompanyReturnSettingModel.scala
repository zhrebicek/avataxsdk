package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CompanyReturnSettingModel(id:Option[Long] = None, companyReturnId:Option[Long] = None, filingQuestionId:Option[Long] = None, filingQuestionCode:Option[String] = None, value:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {

  def withId(value:Long):CompanyReturnSettingModel = copy(id = Some(value))
  def withCompanyReturnId(value:Long):CompanyReturnSettingModel = copy(companyReturnId = Some(value))
  def withFilingQuestionId(value:Long):CompanyReturnSettingModel = copy(filingQuestionId = Some(value))
  def withFilingQuestionCode(value:String):CompanyReturnSettingModel = copy(filingQuestionCode = Some(value))
  def withValue(value:String):CompanyReturnSettingModel = copy(value = Some(value))
  def withCreatedDate(value:Date):CompanyReturnSettingModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):CompanyReturnSettingModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):CompanyReturnSettingModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):CompanyReturnSettingModel = copy(modifiedUserId = Some(value))
}
  
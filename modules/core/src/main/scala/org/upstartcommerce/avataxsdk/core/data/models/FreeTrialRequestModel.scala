package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FreeTrialRequestModel(firstName:Option[String] = None, lastName:Option[String] = None, email:Option[String] = None, company:Option[String] = None, phone:Option[String] = None, campaign:Option[String] = None, companyAddress:Option[CompanyAddress] = None, website:Option[String] = None, haveReadAvalaraTermsAndConditions:Option[Boolean] = None, acceptAvalaraTermsAndConditions:Option[Boolean] = None) {

  def withFirstName(value:String):FreeTrialRequestModel = copy(firstName = Some(value))
  def withLastName(value:String):FreeTrialRequestModel = copy(lastName = Some(value))
  def withEmail(value:String):FreeTrialRequestModel = copy(email = Some(value))
  def withCompany(value:String):FreeTrialRequestModel = copy(company = Some(value))
  def withPhone(value:String):FreeTrialRequestModel = copy(phone = Some(value))
  def withCampaign(value:String):FreeTrialRequestModel = copy(campaign = Some(value))
  def withCompanyAddress(value:CompanyAddress):FreeTrialRequestModel = copy(companyAddress = Some(value))
  def withWebsite(value:String):FreeTrialRequestModel = copy(website = Some(value))
  def withHaveReadAvalaraTermsAndConditions(value:Boolean):FreeTrialRequestModel = copy(haveReadAvalaraTermsAndConditions = Some(value))
  def withAcceptAvalaraTermsAndConditions(value:Boolean):FreeTrialRequestModel = copy(acceptAvalaraTermsAndConditions = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FreeTrialRequestModel(firstName:Option[String] = None, lastName:Option[String] = None, email:Option[String] = None, company:Option[String] = None, phone:Option[String] = None, campaign:Option[String] = None, companyAddress:Option[CompanyAddress] = None, website:Option[String] = None, haveReadAvalaraTermsAndConditions:Option[Boolean] = None, acceptAvalaraTermsAndConditions:Option[Boolean] = None)
  
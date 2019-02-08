package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NewAccountRequestModel(offer:Option[String] = None, connectorId:Option[String] = None, campaign:Option[String] = None, leadSource:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, accountName:Option[String] = None, website:Option[String] = None, paymentMethodId:Option[String] = None, firstName:Option[String] = None, lastName:Option[String] = None, title:Option[String] = None, phoneNumber:Option[String] = None, email:Option[String] = None, userPassword:Option[String] = None, welcomeEmail:Option[WelcomeEmail] = None, companyAddress:Option[CompanyAddress] = None, companyCode:Option[String] = None, properties:Option[List[String]] = None, acceptAvalaraTermsAndConditions:Option[Boolean] = None, haveReadAvalaraTermsAndConditions:Option[Boolean] = None, marketingContext:Option[Map[String, String]] = None)
  
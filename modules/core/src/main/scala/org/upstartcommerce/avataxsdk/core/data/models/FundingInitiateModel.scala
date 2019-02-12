package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FundingInitiateModel(requestEmail:Option[Boolean] = None, fundingEmailRecipient:Option[String] = None, requestWidget:Option[Boolean] = None) {
  def withRequestEmail(value:Boolean):FundingInitiateModel = copy(requestEmail = Some(value))
  def withFundingEmailRecipient(value:String):FundingInitiateModel = copy(fundingEmailRecipient = Some(value))
  def withRequestWidget(value:Boolean):FundingInitiateModel = copy(requestWidget = Some(value))
}
  
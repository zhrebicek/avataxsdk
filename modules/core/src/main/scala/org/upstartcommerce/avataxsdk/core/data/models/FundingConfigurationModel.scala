package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FundingConfigurationModel(companyId:Option[Int] = None, systemType:Option[String] = None, currency:Option[String] = None, isFundingSetup:Option[Boolean] = None, fundingMethod:Option[String] = None, lastUpdated:Option[Date] = None) {
  def withCompanyId(value:Int):FundingConfigurationModel = copy(companyId = Some(value))
  def withSystemType(value:String):FundingConfigurationModel = copy(systemType = Some(value))
  def withCurrency(value:String):FundingConfigurationModel = copy(currency = Some(value))
  def withIsFundingSetup(value:Boolean):FundingConfigurationModel = copy(isFundingSetup = Some(value))
  def withFundingMethod(value:String):FundingConfigurationModel = copy(fundingMethod = Some(value))
  def withLastUpdated(value:Date):FundingConfigurationModel = copy(lastUpdated = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FundingConfigurationModel(companyId:Option[Int] = None, systemType:Option[String] = None, currency:Option[String] = None, isFundingSetup:Option[Boolean] = None, fundingMethod:Option[String] = None, lastUpdated:Option[Date] = None)
  
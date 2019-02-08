package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ComplianceAggregatedTaxRateModel(rate:Option[BigDecimal] = None, stackRate:Option[BigDecimal] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, taxTypeId:Option[String] = None, rateTypeId:Option[String] = None)
  
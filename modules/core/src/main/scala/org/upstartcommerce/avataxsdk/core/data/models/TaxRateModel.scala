package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxRateModel(totalRate:Option[BigDecimal] = None, rates:Option[List[RateModel]] = None)
  
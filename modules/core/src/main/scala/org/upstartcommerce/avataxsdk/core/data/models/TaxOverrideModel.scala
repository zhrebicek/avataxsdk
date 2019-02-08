package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxOverrideModel(`type`:Option[TaxOverrideType] = None, taxAmount:Option[BigDecimal] = None, taxDate:Option[Date] = None, reason:Option[String] = None)
  
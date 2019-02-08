package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class RateModel(rate:Option[BigDecimal] = None, name:Option[String] = None, `type`:Option[JurisdictionType] = None)
  
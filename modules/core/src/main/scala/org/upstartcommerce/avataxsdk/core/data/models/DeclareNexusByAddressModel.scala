package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class DeclareNexusByAddressModel(effectiveDate:Option[Date] = None, endDate:Option[Date] = None, textCase:Option[TextCase] = None, line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, postalCode:Option[String] = None, latitude:Option[BigDecimal] = None, longitude:Option[BigDecimal] = None)
  
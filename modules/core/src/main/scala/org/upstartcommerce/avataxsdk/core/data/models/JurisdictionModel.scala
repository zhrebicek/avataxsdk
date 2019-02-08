package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class JurisdictionModel(code:Option[String] = None, name:Option[String] = None, `type`:Option[JurisdictionType] = None, rate:Option[BigDecimal] = None, salesRate:Option[BigDecimal] = None, signatureCode:Option[String] = None, region:Option[String] = None, useRate:Option[BigDecimal] = None, city:Option[String] = None, county:Option[String] = None, country:Option[String] = None, shortName:Option[String] = None, stateFips:Option[String] = None, countyFips:Option[String] = None, placeFips:Option[String] = None, id:Option[Int] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TransactionSummary(country:Option[String] = None, region:Option[String] = None, jurisType:Option[JurisdictionType] = None, jurisCode:Option[String] = None, jurisName:Option[String] = None, taxAuthorityType:Option[Int] = None, stateAssignedNo:Option[String] = None, taxType:Option[TaxType] = None, taxName:Option[String] = None, taxGroup:Option[String] = None, rateType:Option[RateType] = None, rateTypeCode:Option[String] = None, taxable:Option[BigDecimal] = None, rate:Option[BigDecimal] = None, tax:Option[BigDecimal] = None, taxCalculated:Option[BigDecimal] = None, nonTaxable:Option[BigDecimal] = None, exemption:Option[BigDecimal] = None)
  
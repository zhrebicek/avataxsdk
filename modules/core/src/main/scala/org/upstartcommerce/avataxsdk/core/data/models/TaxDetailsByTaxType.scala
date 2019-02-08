package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxDetailsByTaxType(taxType:Option[String] = None, totalTaxable:Option[BigDecimal] = None, totalExempt:Option[BigDecimal] = None, totalNonTaxable:Option[BigDecimal] = None, totalTax:Option[BigDecimal] = None)
  
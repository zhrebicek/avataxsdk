package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingReturnCreditModel(totalSales:Option[BigDecimal] = None, totalExempt:Option[BigDecimal] = None, totalTaxable:Option[BigDecimal] = None, totalTax:Option[BigDecimal] = None, transactionDetails:Option[List[WorksheetDocument]] = None)
  
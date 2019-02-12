package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingReturnCreditModel(totalSales:Option[BigDecimal] = None, totalExempt:Option[BigDecimal] = None, totalTaxable:Option[BigDecimal] = None, totalTax:Option[BigDecimal] = None, transactionDetails:List[WorksheetDocument] = List.empty) {
  def withTotalSales(value:BigDecimal):FilingReturnCreditModel = copy(totalSales = Some(value))
  def withTotalExempt(value:BigDecimal):FilingReturnCreditModel = copy(totalExempt = Some(value))
  def withTotalTaxable(value:BigDecimal):FilingReturnCreditModel = copy(totalTaxable = Some(value))
  def withTotalTax(value:BigDecimal):FilingReturnCreditModel = copy(totalTax = Some(value))
  def withTransactionDetails(value:List[WorksheetDocument]):FilingReturnCreditModel = copy(transactionDetails = value)
}
  
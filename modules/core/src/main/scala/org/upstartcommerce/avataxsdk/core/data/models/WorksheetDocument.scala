package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class WorksheetDocument(docCode:Option[String] = None, docDate:Option[Date] = None, totalExempt:Option[BigDecimal] = None, totalTaxable:Option[BigDecimal] = None, totalTax:Option[BigDecimal] = None, lines:List[WorksheetDocumentLine] = List.empty, messages:List[Message] = List.empty, resultCode:Option[String] = None, transactionId:Option[String] = None) {
  def withDocCode(value:String):WorksheetDocument = copy(docCode = Some(value))
  def withDocDate(value:Date):WorksheetDocument = copy(docDate = Some(value))
  def withTotalExempt(value:BigDecimal):WorksheetDocument = copy(totalExempt = Some(value))
  def withTotalTaxable(value:BigDecimal):WorksheetDocument = copy(totalTaxable = Some(value))
  def withTotalTax(value:BigDecimal):WorksheetDocument = copy(totalTax = Some(value))
  def withLines(value:List[WorksheetDocumentLine]):WorksheetDocument = copy(lines = value)
  def withMessages(value:List[Message]):WorksheetDocument = copy(messages = value)
  def withResultCode(value:String):WorksheetDocument = copy(resultCode = Some(value))
  def withTransactionId(value:String):WorksheetDocument = copy(transactionId = Some(value))
}
  
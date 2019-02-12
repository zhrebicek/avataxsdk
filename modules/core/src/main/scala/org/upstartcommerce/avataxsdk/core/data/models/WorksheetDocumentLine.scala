package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class WorksheetDocumentLine(reportingDate:Option[Date] = None, lineNo:Option[String] = None, lineAmount:Option[BigDecimal] = None, exemptAmount:Option[BigDecimal] = None, taxableAmount:Option[BigDecimal] = None, taxAmount:Option[BigDecimal] = None, messages:List[Message] = List.empty, resultCode:Option[String] = None, transactionId:Option[String] = None) {
  def withReportingDate(value:Date):WorksheetDocumentLine = copy(reportingDate = Some(value))
  def withLineNo(value:String):WorksheetDocumentLine = copy(lineNo = Some(value))
  def withLineAmount(value:BigDecimal):WorksheetDocumentLine = copy(lineAmount = Some(value))
  def withExemptAmount(value:BigDecimal):WorksheetDocumentLine = copy(exemptAmount = Some(value))
  def withTaxableAmount(value:BigDecimal):WorksheetDocumentLine = copy(taxableAmount = Some(value))
  def withTaxAmount(value:BigDecimal):WorksheetDocumentLine = copy(taxAmount = Some(value))
  def withMessages(value:List[Message]):WorksheetDocumentLine = copy(messages = value)
  def withResultCode(value:String):WorksheetDocumentLine = copy(resultCode = Some(value))
  def withTransactionId(value:String):WorksheetDocumentLine = copy(transactionId = Some(value))
}
  
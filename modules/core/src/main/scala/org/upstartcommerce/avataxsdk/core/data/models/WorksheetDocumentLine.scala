package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class WorksheetDocumentLine(reportingDate:Option[Date] = None, lineNo:Option[String] = None, lineAmount:Option[BigDecimal] = None, exemptAmount:Option[BigDecimal] = None, taxableAmount:Option[BigDecimal] = None, taxAmount:Option[BigDecimal] = None, messages:Option[List[Message]] = None, resultCode:Option[String] = None, transactionId:Option[String] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class WorksheetDocument(docCode:Option[String] = None, docDate:Option[Date] = None, totalExempt:Option[BigDecimal] = None, totalTaxable:Option[BigDecimal] = None, totalTax:Option[BigDecimal] = None, lines:Option[List[WorksheetDocumentLine]] = None, messages:Option[List[Message]] = None, resultCode:Option[String] = None, transactionId:Option[String] = None)
  
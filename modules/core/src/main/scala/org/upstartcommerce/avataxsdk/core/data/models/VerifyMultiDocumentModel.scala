package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class VerifyMultiDocumentModel(code:Option[String] = None, `type`:Option[DocumentType] = None, verifyTransactionDate:Option[Date] = None, verifyTotalAmount:Option[BigDecimal] = None, verifyTotalTax:Option[BigDecimal] = None)
  
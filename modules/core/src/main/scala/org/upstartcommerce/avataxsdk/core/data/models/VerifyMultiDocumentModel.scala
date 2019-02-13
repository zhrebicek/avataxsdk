package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class VerifyMultiDocumentModel(code:Option[String] = None, `type`:Option[DocumentType] = None, verifyTransactionDate:Option[Date] = None, verifyTotalAmount:Option[BigDecimal] = None, verifyTotalTax:Option[BigDecimal] = None) {

  def withCode(value:String):VerifyMultiDocumentModel = copy(code = Some(value))
  def withType(value:DocumentType):VerifyMultiDocumentModel = copy(`type` = Some(value))
  def withVerifyTransactionDate(value:Date):VerifyMultiDocumentModel = copy(verifyTransactionDate = Some(value))
  def withVerifyTotalAmount(value:BigDecimal):VerifyMultiDocumentModel = copy(verifyTotalAmount = Some(value))
  def withVerifyTotalTax(value:BigDecimal):VerifyMultiDocumentModel = copy(verifyTotalTax = Some(value))
}
  
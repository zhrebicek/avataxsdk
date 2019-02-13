package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class RefundTransactionModel(refundTransactionCode:Option[String] = None, refundDate:Option[Date] = None, refundType:Option[RefundType] = None, refundPercentage:Option[BigDecimal] = None, refundLines:Option[List[String]] = None, referenceCode:Option[String] = None) {
  lazy val refundLinesRaw:List[String] = refundLines.getOrElse(List.empty)
  def withRefundTransactionCode(value:String):RefundTransactionModel = copy(refundTransactionCode = Some(value))
  def withRefundDate(value:Date):RefundTransactionModel = copy(refundDate = Some(value))
  def withRefundType(value:RefundType):RefundTransactionModel = copy(refundType = Some(value))
  def withRefundPercentage(value:BigDecimal):RefundTransactionModel = copy(refundPercentage = Some(value))
  def withRefundLines(value:List[String]):RefundTransactionModel = copy(refundLines = Some(value))
  def withReferenceCode(value:String):RefundTransactionModel = copy(referenceCode = Some(value))
}
  
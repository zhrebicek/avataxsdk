package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class RefundTransactionModel(refundTransactionCode:Option[String] = None, refundDate:Option[Date] = None, refundType:Option[RefundType] = None, refundPercentage:Option[BigDecimal] = None, refundLines:Option[List[String]] = None, referenceCode:Option[String] = None)
  
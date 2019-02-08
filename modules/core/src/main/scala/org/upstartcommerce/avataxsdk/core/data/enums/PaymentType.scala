package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait PaymentType
object PaymentType {
  case object CurrentPeriod extends PaymentType
  case object Prepayment    extends PaymentType
  case object PriorPayment  extends PaymentType
  case object PriorCspFee   extends PaymentType
}

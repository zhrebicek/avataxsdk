package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait RefundType
object RefundType {
  case object Full       extends RefundType
  case object Partial    extends RefundType
  case object TaxOnly    extends RefundType
  case object Percentage extends RefundType
}

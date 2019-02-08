package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait VoidReasonCode
object VoidReasonCode {
  case object Unspecified         extends VoidReasonCode
  case object PostFailed          extends VoidReasonCode
  case object DocDeleted          extends VoidReasonCode
  case object DocVoided           extends VoidReasonCode
  case object AdjustmentCancelled extends VoidReasonCode
}

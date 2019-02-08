package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AdjustmentPeriodTypeId
object AdjustmentPeriodTypeId {
  case object None          extends AdjustmentPeriodTypeId
  case object CurrentPeriod extends AdjustmentPeriodTypeId
  case object NextPeriod    extends AdjustmentPeriodTypeId
}

package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AdjustmentTypeId
object AdjustmentTypeId {
  case object Other                 extends AdjustmentTypeId
  case object CurrentPeriodRounding extends AdjustmentTypeId
  case object PriorPeriodRounding   extends AdjustmentTypeId
  case object CurrentPeriodDiscount extends AdjustmentTypeId
  case object PriorPeriodDiscount   extends AdjustmentTypeId
  case object Penalty               extends AdjustmentTypeId
  case object Interest              extends AdjustmentTypeId
  case object Discount              extends AdjustmentTypeId
  case object Rounding              extends AdjustmentTypeId
  case object CspFree               extends AdjustmentTypeId
  case object Marketplace           extends AdjustmentTypeId
}

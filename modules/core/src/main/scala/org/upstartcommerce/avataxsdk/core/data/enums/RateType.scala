package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait RateType
object RateType {
  case object Food extends RateType
  case object General extends RateType
  case object IncreasedStandard extends RateType
  case object LinenRental extends RateType
  case object Medical extends RateType
  case object Parking extends RateType
  case object ReducedA extends RateType
  case object ReducedB extends RateType
  case object ReducedR extends RateType
  case object Standard extends RateType
  case object SuperReduced extends RateType
  case object Zero extends RateType
  case object Services extends RateType
}
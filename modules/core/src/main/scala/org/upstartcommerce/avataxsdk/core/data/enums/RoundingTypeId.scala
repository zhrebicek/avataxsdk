package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait RoundingTypeId
object RoundingTypeId {
  case object None    extends RoundingTypeId
  case object Nearest extends RoundingTypeId
  case object Up      extends RoundingTypeId
  case object Down    extends RoundingTypeId
}

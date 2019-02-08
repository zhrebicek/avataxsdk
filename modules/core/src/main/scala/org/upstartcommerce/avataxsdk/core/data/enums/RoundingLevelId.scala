package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait RoundingLevelId
object RoundingLevelId {
  case object Line     extends RoundingLevelId
  case object Document extends RoundingLevelId
}

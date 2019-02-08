package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait BoundaryLevelForJO
object BoundaryLevelForJO {
  case object VeryPreciseFullAddress extends BoundaryLevelForJO
  case object PreciseZIP9            extends BoundaryLevelForJO
  case object ZIP5Only               extends BoundaryLevelForJO
}

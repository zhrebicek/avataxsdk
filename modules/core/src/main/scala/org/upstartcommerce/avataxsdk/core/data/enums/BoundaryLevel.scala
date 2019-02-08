package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait BoundaryLevel
object BoundaryLevel {
  case object Address extends BoundaryLevel
  case object Zip9    extends BoundaryLevel
  case object Zip5    extends BoundaryLevel
}

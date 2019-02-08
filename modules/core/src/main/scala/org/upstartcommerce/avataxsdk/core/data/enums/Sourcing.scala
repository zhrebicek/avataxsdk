package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait Sourcing
object Sourcing {
  case object Origin      extends Sourcing
  case object Destination extends Sourcing
  case object Mixed       extends Sourcing
}

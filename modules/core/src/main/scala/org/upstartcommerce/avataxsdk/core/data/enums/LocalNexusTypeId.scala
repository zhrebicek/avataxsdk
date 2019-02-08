package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait LocalNexusTypeId
object LocalNexusTypeId {
  case object Selected extends LocalNexusTypeId
  case object StateAdministered extends LocalNexusTypeId
  case object All extends LocalNexusTypeId
}
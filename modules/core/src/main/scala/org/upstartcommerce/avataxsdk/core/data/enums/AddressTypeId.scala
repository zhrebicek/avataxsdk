package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AddressTypeId
object AddressTypeId {
  case object Location    extends AddressTypeId
  case object Salesperson extends AddressTypeId
  case object Marketplace extends AddressTypeId
}

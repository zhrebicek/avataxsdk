package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TransactionAddressType
object TransactionAddressType {
  case object ShipFrom               extends TransactionAddressType
  case object ShipTo                 extends TransactionAddressType
  case object PointOfOrderAcceptance extends TransactionAddressType
  case object PointOfOrderOrigin     extends TransactionAddressType
  case object SingleLocation         extends TransactionAddressType
}

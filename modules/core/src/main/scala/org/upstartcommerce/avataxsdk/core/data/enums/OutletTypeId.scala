package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait OutletTypeId
object OutletTypeId {
  case object None         extends OutletTypeId
  case object Schedule     extends OutletTypeId
  case object Duplicate    extends OutletTypeId
  case object Consolidated extends OutletTypeId
}

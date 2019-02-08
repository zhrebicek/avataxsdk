package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait PointOfSalePartnerId
object PointOfSalePartnerId {
  case object DMA extends PointOfSalePartnerId
  case object AX7 extends PointOfSalePartnerId
}

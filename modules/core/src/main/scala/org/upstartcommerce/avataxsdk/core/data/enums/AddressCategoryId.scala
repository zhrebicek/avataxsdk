package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AddressCategoryId
object AddressCategoryId {
  case object Storefront           extends AddressCategoryId
  case object MainOffice           extends AddressCategoryId
  case object Warehouse            extends AddressCategoryId
  case object Salesperson          extends AddressCategoryId
  case object Other                extends AddressCategoryId
  case object SellerRemitsTax      extends AddressCategoryId
  case object MarketplaceRemitsTax extends AddressCategoryId
  case object NonPhysical          extends AddressCategoryId
}

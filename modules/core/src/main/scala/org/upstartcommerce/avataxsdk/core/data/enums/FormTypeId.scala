package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FormTypeId
object FormTypeId {
  case object SalesAndUse       extends FormTypeId
  case object Sales             extends FormTypeId
  case object SellersUse        extends FormTypeId
  case object Lodging           extends FormTypeId
  case object SalesAndLodging   extends FormTypeId
  case object ConsumerUse       extends FormTypeId
  case object ResortAndRental   extends FormTypeId
  case object TouristAndRental  extends FormTypeId
  case object Prepayment        extends FormTypeId
  case object PrepaymentAllowed extends FormTypeId
}

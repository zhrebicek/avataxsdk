package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TaxType
object TaxType {
  case object Sales extends TaxType
  case object Use extends TaxType
  case object ConsumerUse extends TaxType
  case object Output extends TaxType
  case object Input extends TaxType
  case object Nonrecoverable extends TaxType
  case object Fee extends TaxType
  case object Rental extends TaxType
  case object Excise extends TaxType
  case object Lodging extends TaxType
  case object Bottle extends TaxType
  case object EWaste extends TaxType
  case object LandedCost extends TaxType
}
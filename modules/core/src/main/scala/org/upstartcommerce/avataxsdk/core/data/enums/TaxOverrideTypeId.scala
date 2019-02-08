package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TaxOverrideTypeId
object TaxOverrideTypeId {
  case object None             extends TaxOverrideTypeId
  case object TaxAmount        extends TaxOverrideTypeId
  case object Exemption        extends TaxOverrideTypeId
  case object TaxDate          extends TaxOverrideTypeId
  case object AccruedTaxAmount extends TaxOverrideTypeId
  case object DeriveTaxable    extends TaxOverrideTypeId
}

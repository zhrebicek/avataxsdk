package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TaxOverrideType
object TaxOverrideType {
  case object None             extends TaxOverrideType
  case object TaxAmount        extends TaxOverrideType
  case object Exemption        extends TaxOverrideType
  case object TaxDate          extends TaxOverrideType
  case object AccruedTaxAmount extends TaxOverrideType
  case object DeriveTaxable    extends TaxOverrideType
}

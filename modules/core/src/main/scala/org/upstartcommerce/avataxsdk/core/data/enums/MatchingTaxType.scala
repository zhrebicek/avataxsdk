package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait MatchingTaxType
object MatchingTaxType {
  case object All                         extends MatchingTaxType
  case object BothSalesAndUseTax          extends MatchingTaxType
  case object ConsumerUseTax              extends MatchingTaxType
  case object SalesTax                    extends MatchingTaxType
  case object UseTax                      extends MatchingTaxType
  case object VATOutputTax                extends MatchingTaxType
  case object VATInputTax                 extends MatchingTaxType
  case object VatNonrecoverableInputTax   extends MatchingTaxType
  case object Fee                         extends MatchingTaxType
  case object Rental                      extends MatchingTaxType
  case object ConsumerUseAndSalesTax      extends MatchingTaxType
  case object ConsumerUseAndSellersUseTax extends MatchingTaxType
  case object Excise                      extends MatchingTaxType
  case object Lodging                     extends MatchingTaxType
  case object Bottle                      extends MatchingTaxType
  case object RentToOwn                   extends MatchingTaxType
}

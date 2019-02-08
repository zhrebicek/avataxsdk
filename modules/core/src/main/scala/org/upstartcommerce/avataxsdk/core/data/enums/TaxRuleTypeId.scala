package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TaxRuleTypeId
object TaxRuleTypeId {
  case object RateRule              extends TaxRuleTypeId
  case object RateOverrideRule      extends TaxRuleTypeId
  case object BaseRule              extends TaxRuleTypeId
  case object ExemptEntityRule      extends TaxRuleTypeId
  case object ProductTaxabilityRule extends TaxRuleTypeId
  case object NexusRule             extends TaxRuleTypeId
}

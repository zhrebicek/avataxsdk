package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AdjustmentReason
object AdjustmentReason {
  case object NotAdjusted                 extends AdjustmentReason
  case object SourcingIssue               extends AdjustmentReason
  case object ReconciledWithGeneralLedger extends AdjustmentReason
  case object ExemptCertApplied           extends AdjustmentReason
  case object PriceAdjusted               extends AdjustmentReason
  case object ProductReturned             extends AdjustmentReason
  case object ProductExchanged            extends AdjustmentReason
  case object BadDept                     extends AdjustmentReason
  case object Other                       extends AdjustmentReason
  case object Offline                     extends AdjustmentReason
}

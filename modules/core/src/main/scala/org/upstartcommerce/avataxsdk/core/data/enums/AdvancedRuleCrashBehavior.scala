package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AdvancedRuleCrashBehavior
object AdvancedRuleCrashBehavior {
  case object FailOnError         extends AdvancedRuleCrashBehavior
  case object ProceedWithOriginal extends AdvancedRuleCrashBehavior
}

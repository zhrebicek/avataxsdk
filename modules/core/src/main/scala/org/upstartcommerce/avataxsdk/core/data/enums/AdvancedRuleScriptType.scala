package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AdvancedRuleScriptType
object AdvancedRuleScriptType {
  case object RequestRule  extends AdvancedRuleScriptType
  case object ResponseRule extends AdvancedRuleScriptType
}

package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AdvancedRuleScriptModel(id:Option[Long] = None, accountId:Option[Int] = None, crashBehavior:Option[AdvancedRuleCrashBehavior] = None, scriptType:Option[AdvancedRuleScriptType] = None, script:Option[String] = None, isApproved:Option[Boolean] = None, isDisabled:Option[Boolean] = None) {
  def withId(value:Long):AdvancedRuleScriptModel = copy(id = Some(value))
  def withAccountId(value:Int):AdvancedRuleScriptModel = copy(accountId = Some(value))
  def withCrashBehavior(value:AdvancedRuleCrashBehavior):AdvancedRuleScriptModel = copy(crashBehavior = Some(value))
  def withScriptType(value:AdvancedRuleScriptType):AdvancedRuleScriptModel = copy(scriptType = Some(value))
  def withScript(value:String):AdvancedRuleScriptModel = copy(script = Some(value))
  def withIsApproved(value:Boolean):AdvancedRuleScriptModel = copy(isApproved = Some(value))
  def withIsDisabled(value:Boolean):AdvancedRuleScriptModel = copy(isDisabled = Some(value))
}
  
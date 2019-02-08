package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AdvancedRuleScriptModel(id:Option[Long] = None, accountId:Option[Int] = None, crashBehavior:Option[AdvancedRuleCrashBehavior] = None, scriptType:Option[AdvancedRuleScriptType] = None, script:Option[String] = None, isApproved:Option[Boolean] = None, isDisabled:Option[Boolean] = None)
  
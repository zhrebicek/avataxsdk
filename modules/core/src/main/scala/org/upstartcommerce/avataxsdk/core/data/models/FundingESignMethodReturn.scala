package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FundingESignMethodReturn(method:Option[String] = None, javaScriptReady:Option[Boolean] = None, javaScript:Option[String] = None) {

  def withMethod(value:String):FundingESignMethodReturn = copy(method = Some(value))
  def withJavaScriptReady(value:Boolean):FundingESignMethodReturn = copy(javaScriptReady = Some(value))
  def withJavaScript(value:String):FundingESignMethodReturn = copy(javaScript = Some(value))
}
  
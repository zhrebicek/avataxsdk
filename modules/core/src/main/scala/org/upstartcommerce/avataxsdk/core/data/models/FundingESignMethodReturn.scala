package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FundingESignMethodReturn(method:Option[String] = None, javaScriptReady:Option[Boolean] = None, javaScript:Option[String] = None)
  
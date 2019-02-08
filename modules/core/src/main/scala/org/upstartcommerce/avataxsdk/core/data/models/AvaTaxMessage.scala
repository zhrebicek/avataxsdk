package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AvaTaxMessage(summary:Option[String] = None, details:Option[String] = None, refersTo:Option[String] = None, severity:Option[String] = None, source:Option[String] = None)
  
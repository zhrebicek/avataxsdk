package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class Message(details:Option[String] = None, helpLink:Option[String] = None, name:Option[String] = None, refersTo:Option[String] = None, severity:Option[String] = None, source:Option[String] = None, summary:Option[String] = None)
  
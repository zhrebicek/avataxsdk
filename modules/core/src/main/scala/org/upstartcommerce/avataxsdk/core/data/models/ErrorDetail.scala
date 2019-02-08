package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ErrorDetail(code:Option[ErrorCodeId] = None, number:Option[Int] = None, message:Option[String] = None, description:Option[String] = None, faultCode:Option[String] = None, helpLink:Option[String] = None, refersTo:Option[String] = None, severity:Option[SeverityLevel] = None)
  
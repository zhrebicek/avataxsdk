package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ErrorInfo(code:Option[ErrorCodeId] = None, message:Option[String] = None, target:Option[ErrorTargetCode] = None, details:Option[List[ErrorDetail]] = None)
  
package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait SeverityLevel
object SeverityLevel {
  case object Success   extends SeverityLevel
  case object Warning   extends SeverityLevel
  case object Error     extends SeverityLevel
  case object Exception extends SeverityLevel
}

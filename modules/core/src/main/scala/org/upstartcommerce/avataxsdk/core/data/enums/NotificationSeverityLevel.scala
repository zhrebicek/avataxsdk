package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait NotificationSeverityLevel
object NotificationSeverityLevel {
  case object Complete extends NotificationSeverityLevel
  case object Neutral  extends NotificationSeverityLevel
  case object Advisory extends NotificationSeverityLevel
  case object Blocking extends NotificationSeverityLevel
}

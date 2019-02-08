package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ReportFormat
object ReportFormat {
  case object CSV extends ReportFormat
  case object XML extends ReportFormat
}
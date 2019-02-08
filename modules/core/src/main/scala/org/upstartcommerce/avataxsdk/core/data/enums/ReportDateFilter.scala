package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ReportDateFilter
object ReportDateFilter {
  case object ReportingDate extends ReportDateFilter
  case object DocumentDate  extends ReportDateFilter
  case object TaxDate       extends ReportDateFilter
  case object PaymentDate   extends ReportDateFilter
}

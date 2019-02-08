package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ReportDocType
object ReportDocType {
  case object Sales       extends ReportDocType
  case object ConsumerUse extends ReportDocType
}

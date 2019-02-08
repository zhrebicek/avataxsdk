package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait WorksheetTypeId
object WorksheetTypeId {
  case object Original extends WorksheetTypeId
  case object Amended  extends WorksheetTypeId
  case object Test     extends WorksheetTypeId
}

package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait DueDateTypeId
object DueDateTypeId {
  case object ByDay           extends DueDateTypeId
  case object ByLastDay       extends DueDateTypeId
  case object BySecondLastDay extends DueDateTypeId
}

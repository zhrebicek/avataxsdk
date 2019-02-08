package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait BatchStatus
object BatchStatus {
  case object Waiting      extends BatchStatus
  case object SystemErrors extends BatchStatus
  case object Cancelled    extends BatchStatus
  case object Completed    extends BatchStatus
  case object Creating     extends BatchStatus
  case object Deleted      extends BatchStatus
  case object Errors       extends BatchStatus
  case object Paused       extends BatchStatus
  case object Processing   extends BatchStatus
}
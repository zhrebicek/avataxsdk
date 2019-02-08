package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait DocumentStatus
object DocumentStatus {
  case object Temporary extends DocumentStatus
  case object Saved extends DocumentStatus
  case object Posted extends DocumentStatus
  case object Commited extends DocumentStatus
  case object Cancelled extends DocumentStatus
  case object Adjusted extends DocumentStatus

  @deprecated("based on sdk", "unknown")
  case object Queued extends DocumentStatus

  case object PendingApproval extends DocumentStatus

  @deprecated("based on sdk", "unknown")
  case object Any extends DocumentStatus

}
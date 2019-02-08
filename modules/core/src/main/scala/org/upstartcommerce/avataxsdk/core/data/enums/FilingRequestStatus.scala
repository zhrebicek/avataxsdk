package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FilingRequestStatus
object FilingRequestStatus {
  case object New             extends FilingRequestStatus
  case object Validated       extends FilingRequestStatus
  case object Pending         extends FilingRequestStatus
  case object Active          extends FilingRequestStatus
  case object PendingStop     extends FilingRequestStatus
  case object Inactive        extends FilingRequestStatus
  case object ChangeRequest   extends FilingRequestStatus
  case object RequestApproved extends FilingRequestStatus
  case object RequestDenied   extends FilingRequestStatus
}

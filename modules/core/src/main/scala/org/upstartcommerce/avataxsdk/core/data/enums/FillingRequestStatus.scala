package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FillingRequestStatus
object FillingRequestStatus {
  case object New             extends FillingRequestStatus
  case object Validated       extends FillingRequestStatus
  case object Pending         extends FillingRequestStatus
  case object Active          extends FillingRequestStatus
  case object PendingStop     extends FillingRequestStatus
  case object Inactive        extends FillingRequestStatus
  case object ChangeRequest   extends FillingRequestStatus
  case object RequestApproved extends FillingRequestStatus
  case object RequestDenied   extends FillingRequestStatus
}

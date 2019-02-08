package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FillingStatusId
object FillingStatusId {
  case object PendingApproval       extends FillingStatusId
  case object Dirty                 extends FillingStatusId
  case object ApprovedToFile        extends FillingStatusId
  case object PendingFiling         extends FillingStatusId
  case object PendingFilingOnBehalf extends FillingStatusId
  case object Filed                 extends FillingStatusId
  case object FiledOnBehalf extends FillingStatusId
  case object ReturnAccepted extends FillingStatusId
  case object ReturnAcceptedOnBehalf extends FillingStatusId
  case object PaymentRemitted extends FillingStatusId
  case object Voided extends FillingStatusId
  case object PendingReturn extends FillingStatusId
  case object PendingReturnOnBehalf extends FillingStatusId
  case object DoNotFile extends FillingStatusId
  case object ReturnRejected extends FillingStatusId
  case object ReturnRejectedOnBehalf extends FillingStatusId
  case object ApprovedToFileOnBehalf extends FillingStatusId
}

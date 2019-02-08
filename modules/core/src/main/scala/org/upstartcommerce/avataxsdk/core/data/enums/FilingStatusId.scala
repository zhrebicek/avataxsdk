package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FilingStatusId
object FilingStatusId {
  case object PendingApproval        extends FilingStatusId
  case object Dirty                  extends FilingStatusId
  case object ApprovedToFile         extends FilingStatusId
  case object PendingFiling          extends FilingStatusId
  case object PendingFilingOnBehalf  extends FilingStatusId
  case object Filed                  extends FilingStatusId
  case object FiledOnBehalf          extends FilingStatusId
  case object ReturnAccepted         extends FilingStatusId
  case object ReturnAcceptedOnBehalf extends FilingStatusId
  case object PaymentRemitted        extends FilingStatusId
  case object Voided                 extends FilingStatusId
  case object PendingReturn          extends FilingStatusId
  case object PendingReturnOnBehalf  extends FilingStatusId
  case object DoNotFile              extends FilingStatusId
  case object ReturnRejected         extends FilingStatusId
  case object ReturnRejectedOnBehalf extends FilingStatusId
  case object ApprovedToFileOnBehalf extends FilingStatusId
}

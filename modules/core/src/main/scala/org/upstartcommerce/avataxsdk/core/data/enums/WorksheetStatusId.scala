package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait WorksheetStatusId
object WorksheetStatusId {
  case object PendingApproval        extends WorksheetStatusId
  case object Dirty                  extends WorksheetStatusId
  case object ApprovedToFile         extends WorksheetStatusId
  case object PendingFiling          extends WorksheetStatusId
  case object PendingFilingOnBehalf  extends WorksheetStatusId
  case object Filed                  extends WorksheetStatusId
  case object FiledOnBehalf          extends WorksheetStatusId
  case object ReturnAccepted         extends WorksheetStatusId
  case object ReturnAcceptedOnBehalf extends WorksheetStatusId
  case object PaymentRemitted        extends WorksheetStatusId
  case object Voided                 extends WorksheetStatusId
  case object PendingReturn          extends WorksheetStatusId
  case object PendingReturnOnBehalf  extends WorksheetStatusId
  case object DoNotFile              extends WorksheetStatusId
  case object ReturnRejected         extends WorksheetStatusId
  case object ReturnRejectedOnBehalf extends WorksheetStatusId
  case object ApprovedToFileOnBehalf extends WorksheetStatusId
}

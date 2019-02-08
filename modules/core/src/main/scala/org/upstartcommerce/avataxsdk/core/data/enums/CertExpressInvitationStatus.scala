package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait CertExpressInvitationStatus
object CertExpressInvitationStatus {
  case object InProgress extends CertExpressInvitationStatus
  case object Ready      extends CertExpressInvitationStatus
}

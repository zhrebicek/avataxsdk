package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait CertCaptureProvisionStatus
object CertCaptureProvisionStatus {
  case object Provisioned    extends CertCaptureProvisionStatus
  case object InProgress     extends CertCaptureProvisionStatus
  case object NotProvisioned extends CertCaptureProvisionStatus
}

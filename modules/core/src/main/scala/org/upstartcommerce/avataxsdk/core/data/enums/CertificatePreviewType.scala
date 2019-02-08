package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait CertificatePreviewType
object CertificatePreviewType {
  case object Pdf  extends CertificatePreviewType
  case object Jpeg extends CertificatePreviewType
}

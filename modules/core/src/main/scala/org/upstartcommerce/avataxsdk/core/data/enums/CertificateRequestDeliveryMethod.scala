package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait CertificateRequestDeliveryMethod
object CertificateRequestDeliveryMethod {
  case object Email    extends CertificateRequestDeliveryMethod
  case object Fax      extends CertificateRequestDeliveryMethod
  case object Download extends CertificateRequestDeliveryMethod
}

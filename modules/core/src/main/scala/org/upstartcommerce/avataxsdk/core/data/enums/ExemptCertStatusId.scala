package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ExemptCertStatusId
object ExemptCertStatusId {
  case object Inactive extends ExemptCertStatusId
  case object Active   extends ExemptCertStatusId
  case object Expired  extends ExemptCertStatusId
  case object Revoked  extends ExemptCertStatusId
}
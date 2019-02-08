package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ExemptCertTypeId
object ExemptCertTypeId {
  case object Blanket   extends ExemptCertTypeId
  case object SingleUse extends ExemptCertTypeId
}

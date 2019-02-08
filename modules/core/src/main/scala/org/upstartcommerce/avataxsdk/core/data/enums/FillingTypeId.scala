package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FillingTypeId
object FillingTypeId {
  case object PaperReturn      extends FillingTypeId
  case object ElectronicReturn extends FillingTypeId
  case object SER              extends FillingTypeId
  case object EFTPaper         extends FillingTypeId
  case object PhonePaper       extends FillingTypeId
  case object SignatureReady   extends FillingTypeId
  case object EfileCheck       extends FillingTypeId
}

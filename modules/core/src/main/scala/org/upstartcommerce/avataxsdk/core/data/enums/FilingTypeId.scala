package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FilingTypeId
object FilingTypeId {
  case object PaperReturn      extends FilingTypeId
  case object ElectronicReturn extends FilingTypeId
  case object SER              extends FilingTypeId
  case object EFTPaper         extends FilingTypeId
  case object PhonePaper       extends FilingTypeId
  case object SignatureReady   extends FilingTypeId
  case object EfileCheck       extends FilingTypeId
}

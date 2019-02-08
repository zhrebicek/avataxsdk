package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FilingOptionTypeId
object FilingOptionTypeId {
  case object Paper extends FilingOptionTypeId
  case object OptionalEfile extends FilingOptionTypeId
  case object MandatoryEfile extends FilingOptionTypeId
}
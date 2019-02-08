package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FillingOptionTypeId
object FillingOptionTypeId {
  case object Paper extends FillingOptionTypeId
  case object OptionalEfile extends FillingOptionTypeId
  case object MandatoryEfile extends FillingOptionTypeId
}
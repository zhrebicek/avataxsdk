package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TextCase
object TextCase {
  case object Upper extends TextCase
  case object Mixed extends TextCase
}

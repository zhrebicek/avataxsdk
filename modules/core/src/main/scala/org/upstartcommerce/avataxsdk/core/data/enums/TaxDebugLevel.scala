package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TaxDebugLevel
object TaxDebugLevel {
  case object Normal     extends TaxDebugLevel
  case object Diagnostic extends TaxDebugLevel
}

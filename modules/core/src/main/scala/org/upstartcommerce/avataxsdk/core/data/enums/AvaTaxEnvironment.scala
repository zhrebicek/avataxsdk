package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AvaTaxEnvironment
object AvaTaxEnvironment {
  case object Production extends AvaTaxEnvironment
  case object Sandbox extends AvaTaxEnvironment
}
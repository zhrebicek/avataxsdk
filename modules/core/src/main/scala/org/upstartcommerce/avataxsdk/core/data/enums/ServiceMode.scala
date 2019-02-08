package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ServiceMode
object ServiceMode {
  case object Automatic extends ServiceMode
  case object Local     extends ServiceMode
  case object Remote    extends ServiceMode
}

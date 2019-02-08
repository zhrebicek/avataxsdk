package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait WelcomeEmail
object WelcomeEmail {
  case object Normal     extends WelcomeEmail
  case object Suppressed extends WelcomeEmail
  case object Custom     extends WelcomeEmail
}

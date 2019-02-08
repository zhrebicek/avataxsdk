package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ErrorTargetCode
object ErrorTargetCode {
  case object Unknown                extends ErrorTargetCode
  case object HttpRequest            extends ErrorTargetCode
  case object HttpRequestHeaders     extends ErrorTargetCode
  case object IncorrectData          extends ErrorTargetCode
  case object AvaTaxApiServer        extends ErrorTargetCode
  case object AvalaraIdentityServer extends ErrorTargetCode
  case object CustomerAccountSetup   extends ErrorTargetCode
}

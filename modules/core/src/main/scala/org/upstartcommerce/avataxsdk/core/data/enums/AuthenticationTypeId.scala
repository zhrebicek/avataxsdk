package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AuthenticationTypeId
object AuthenticationTypeId {
  case object None                extends AuthenticationTypeId
  case object UsernamePassword    extends AuthenticationTypeId
  case object AccountIdLicenseKey extends AuthenticationTypeId
  case object OpenIdBearerToken   extends AuthenticationTypeId
}

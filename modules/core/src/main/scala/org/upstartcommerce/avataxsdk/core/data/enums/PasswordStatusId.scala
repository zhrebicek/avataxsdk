package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait PasswordStatusId
object PasswordStatusId {
  case object UserCannotChange extends PasswordStatusId
  case object UserCanChange extends PasswordStatusId
  case object UserMustChange extends PasswordStatusId
}
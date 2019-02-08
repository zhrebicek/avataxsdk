package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AccountStatusId
object AccountStatusId {
  case object Inactive extends AccountStatusId
  case object Active   extends AccountStatusId
  case object Test     extends AccountStatusId
  case object New      extends AccountStatusId
}

package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait AccrualType
object AccrualType {
  case object Filing  extends AccrualType
  case object Accrual extends AccrualType
}

package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait PaymentAccountTypeId
object PaymentAccountTypeId {
  case object None                              extends PaymentAccountTypeId
  case object AccountsReceivableAccountsPayable extends PaymentAccountTypeId
  case object AccountsReceivable                extends PaymentAccountTypeId
  case object AccountsPayable                   extends PaymentAccountTypeId
}

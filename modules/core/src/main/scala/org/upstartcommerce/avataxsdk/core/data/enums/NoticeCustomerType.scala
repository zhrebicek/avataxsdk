package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait NoticeCustomerType
object NoticeCustomerType {
  case object AvaTaxReturns extends NoticeCustomerType
  case object StandAlone    extends NoticeCustomerType
  case object Strategic     extends NoticeCustomerType
  case object SST           extends NoticeCustomerType
  case object TrustFile     extends NoticeCustomerType
}

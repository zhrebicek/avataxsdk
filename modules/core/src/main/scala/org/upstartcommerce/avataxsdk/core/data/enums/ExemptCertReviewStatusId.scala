package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ExemptCertReviewStatusId
object ExemptCertReviewStatusId {
  case object Pending  extends ExemptCertReviewStatusId
  case object Accepted extends ExemptCertReviewStatusId
  case object Rejected extends ExemptCertReviewStatusId
}

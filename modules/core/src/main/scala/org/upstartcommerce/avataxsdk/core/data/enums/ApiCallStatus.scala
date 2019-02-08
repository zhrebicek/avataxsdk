package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ApiCallStatus
object ApiCallStatus {
  case object OriginalApiCallAvailable      extends ApiCallStatus
  case object ReconstructedApiCallAvailable extends ApiCallStatus
  case object Any                           extends ApiCallStatus
}

package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait CompanyFillingStatus
object CompanyFillingStatus {
  case object NoReporting                extends CompanyFillingStatus
  case object NotYetFiling               extends CompanyFillingStatus
  case object FilingRequested            extends CompanyFillingStatus
  case object FirstFiling                extends CompanyFillingStatus
  case object Active                     extends CompanyFillingStatus
  case object NotConfiguredForCompliance extends CompanyFillingStatus
}

package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait CompanyFilingStatus
object CompanyFilingStatus {
  case object NoReporting                extends CompanyFilingStatus
  case object NotYetFiling               extends CompanyFilingStatus
  case object FilingRequested            extends CompanyFilingStatus
  case object FirstFiling                extends CompanyFilingStatus
  case object Active                     extends CompanyFilingStatus
  case object NotConfiguredForCompliance extends CompanyFilingStatus
}

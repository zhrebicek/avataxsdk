package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait CompanyAccessLevel
object CompanyAccessLevel {
  case object None          extends CompanyAccessLevel
  case object SingleCompany extends CompanyAccessLevel
  case object SingleAccount extends CompanyAccessLevel
  case object AllCompanies  extends CompanyAccessLevel
}

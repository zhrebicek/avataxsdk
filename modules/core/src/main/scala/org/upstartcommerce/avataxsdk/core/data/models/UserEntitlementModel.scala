package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UserEntitlementModel(permissions:Option[List[String]] = None, accessLevel:Option[CompanyAccessLevel] = None, companies:Option[List[Int]] = None) {
  lazy val permissionsRaw:List[String] = permissions.getOrElse(List.empty)
  lazy val companiesRaw:List[Int] = companies.getOrElse(List.empty)
  def withPermissions(value:List[String]):UserEntitlementModel = copy(permissions = Some(value))
  def withAccessLevel(value:CompanyAccessLevel):UserEntitlementModel = copy(accessLevel = Some(value))
  def withCompanies(value:List[Int]):UserEntitlementModel = copy(companies = Some(value))
}
  
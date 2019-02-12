package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UserEntitlementModel(permissions:List[String] = List.empty, accessLevel:Option[CompanyAccessLevel] = None, companies:List[Int] = List.empty) {
  def withPermissions(value:List[String]):UserEntitlementModel = copy(permissions = value)
  def withAccessLevel(value:CompanyAccessLevel):UserEntitlementModel = copy(accessLevel = Some(value))
  def withCompanies(value:List[Int]):UserEntitlementModel = copy(companies = value)
}
  
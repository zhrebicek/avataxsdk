package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait SecurityRoleId
object SecurityRoleId {
  case object NoAccess              extends SecurityRoleId
  case object SiteAdmin             extends SecurityRoleId
  case object AccountOperator       extends SecurityRoleId
  case object AccountAdmin          extends SecurityRoleId
  case object AccountUser           extends SecurityRoleId
  case object SystemAdmin           extends SecurityRoleId
  case object Registrar             extends SecurityRoleId
  case object CSPTester             extends SecurityRoleId
  case object CSPAdmin              extends SecurityRoleId
  case object SystemOperator        extends SecurityRoleId
  case object TechnicalSupportUser  extends SecurityRoleId
  case object TechnicalSupportAdmin extends SecurityRoleId
  case object TreasuryUser          extends SecurityRoleId
  case object TreasuryAdmin         extends SecurityRoleId
  case object ComplianceUser        extends SecurityRoleId
  case object ComplianceAdmin       extends SecurityRoleId
  case object ProStoresOperator     extends SecurityRoleId
  case object CompanyUser           extends SecurityRoleId
  case object CompanyAdmin          extends SecurityRoleId
  case object ComplianceTempUser    extends SecurityRoleId
  case object ComplianceRootUser    extends SecurityRoleId
  case object ComplianceOperator    extends SecurityRoleId
  case object SSTAdmin              extends SecurityRoleId
}

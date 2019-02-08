package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait BatchType
object BatchType {
  case object AvaCertUpdate extends BatchType
  case object AvaCertUpdateAll extends BatchType
  case object BatchMaintenance extends BatchType
  case object CompanyLocationImport extends BatchType
  case object DocumentImport extends BatchType
  case object ExemptCertImport extends BatchType
  case object ItemImport extends BatchType
  case object SalesAuditExport extends BatchType
  case object SstpTestDeckImport extends BatchType
  case object TaxRuleImport extends BatchType
  case object TransactionImport extends BatchType
  case object UPCBulkImport extends BatchType
  case object UPCValidationImport extends BatchType
}
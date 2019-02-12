package org.upstartcommerce.avataxsdk.client.json
import java.sql.Date

import org.upstartcommerce.avataxsdk.core.data.enums._
import org.upstartcommerce.avataxsdk.core.data.models._
import play.api.libs.json._
import play.api.libs.functional.syntax._

/** defines formats for all models that are not generated (probably due to amount of columns) */
private[json] trait ModelFormats extends GenModelFormats {
  implicit val createMultiDocumentModelOFormat: OFormat[CreateMultiDocumentModel] = {
    val f1 = ((__ \ "code").formatNullable[String] and
      (__ \ "lines").format[List[MultiDocumentLineItemModel]] and
      (__ \ "allowAdjust").formatNullable[Boolean] and
      (__ \ "type").formatNullable[DocumentType] and
      (__ \ "companyCode").formatNullable[String] and
      (__ \ "date").formatNullable[Date] and
      (__ \ "salespersonCode").formatNullable[String] and
      (__ \ "customerCode").formatNullable[String] and
      (__ \ "customerUsageType").formatNullable[String] and
      (__ \ "entityUseCode").formatNullable[String] and
      (__ \ "discount").formatNullable[BigDecimal] and
      (__ \ "purchaseOrderNo").formatNullable[String] and
      (__ \ "exemptionNo").formatNullable[String] and
      (__ \ "addresses").formatNullable[AddressesModel] and
      (__ \ "parameters").format[Map[String, String]]).tupled

    val f2 = ((__ \ "referenceCode").formatNullable[String] and
      (__ \ "reportingLocationCode").formatNullable[String] and
      (__ \ "commit").formatNullable[Boolean] and
      (__ \ "batchCode").formatNullable[String] and
      (__ \ "taxOverride").formatNullable[TaxOverrideModel] and
      (__ \ "currencyCode").formatNullable[String] and
      (__ \ "serviceMode").formatNullable[ServiceMode] and
      (__ \ "exchangeRate").formatNullable[BigDecimal] and
      (__ \ "exchangeRateEffectiveDate").formatNullable[Date] and
      (__ \ "posLaneCode").formatNullable[String] and
      (__ \ "businessIdentificationNo").formatNullable[String] and
      (__ \ "isSellerImporterOfRecord").formatNullable[Boolean] and
      (__ \ "description").formatNullable[String] and
      (__ \ "email").formatNullable[String] and
      (__ \ "debugLevel").formatNullable[TaxDebugLevel]).tupled

    (f1 and f2).apply(
      {case ((code, lines, allowAdjust, tpe, companyCode, date, salespersonCode, customerCode, customerUsageType,
        entityUseCode, discount, purchaseOrderNo, exemptionNo, addresses, parameters), (referenceCode,
        reportingLocationCode, commit, batchCode, taxOverride, currencyCode, serviceMode, exchangeRate, exchangeRateEff,
        posLaneCode, businessIdNo, isSeller, descri, email, debugLvl)) => CreateMultiDocumentModel(code, lines, allowAdjust, tpe, companyCode, date, salespersonCode, customerCode, customerUsageType,
        entityUseCode, discount, purchaseOrderNo, exemptionNo, addresses, parameters, referenceCode,
        reportingLocationCode, commit, batchCode, taxOverride, currencyCode, serviceMode, exchangeRate, exchangeRateEff,
        posLaneCode, businessIdNo, isSeller, descri, email, debugLvl)},
      { c:CreateMultiDocumentModel => ((c.code, c.lines, c.allowAdjust, c.`type`, c.companyCode, c.date, c.salespersonCode, c.customerCode, c.customerUsageType,
      c.entityUseCode, c.discount, c.purchaseOrderNo, c.exemptionNo, c.addresses, c.parameters), (c.referenceCode, c.reportingLocationCode,
      c.commit, c.batchCode, c.taxOverride, c.currencyCode, c.serviceMode, c.exchangeRate, c.exchangeRateEffectiveDate, c.posLaneCode, c.businessIdentificationNo,
        c.isSellerImporterOfRecord, c.description, c.email, c.debugLevel))}
    )
  }


  implicit val createMultiCompanyTransactionModelOFormat
    : OFormat[CreateMultiCompanyTransactionModel] = ???

  implicit val filingCalendarModelOFormat: OFormat[FilingCalendarModel] = ???
  implicit val locationModelOFormat: OFormat[LocationModel]   = ???
  implicit val nexusModelOFormat: OFormat[NexusModel] = ???
  implicit val createTransactionModelOFormat: OFormat[CreateTransactionModel] = ???
  implicit val filingRegionModelOFormat: OFormat[FilingRegionModel] = ???
  implicit val transactionLineDetailModelOFormat: OFormat[TransactionLineDetailModel] = ???
  implicit val noticeModelOFormat: OFormat[NoticeModel] = ???
  implicit val customerModelOFormat: OFormat[CustomerModel] = ???
  implicit val filingReturnModelBasicOFormat: OFormat[FilingReturnModelBasic] = ???
  implicit val formMasterModelOFormat: OFormat[FormMasterModel] = ???
  implicit val transactionLineModelOFormat: OFormat[TransactionLineModel] = ???
  implicit val filingReturnModelOFormat: OFormat[FilingReturnModel] = ???
  implicit val auditModelOFormat: OFormat[AuditModel]           = ???
  implicit val ecmsModelOFormat: OFormat[EcmsModel] = ???
  implicit val companyModelOFormat: OFormat[CompanyModel] = ???
  implicit val transactionModelOFormat: OFormat[TransactionModel] = ???
  implicit val taxRuleModelOFormat: OFormat[TaxRuleModel] = ???
}

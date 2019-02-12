package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CreateTransactionModel(code:Option[String] = None, lines:List[LineItemModel] = List.empty, `type`:Option[DocumentType] = None, companyCode:Option[String] = None, date:Option[Date] = None, salespersonCode:Option[String] = None, customerCode:Option[String] = None, customerUsageType:Option[String] = None, entityUseCode:Option[String] = None, discount:Option[BigDecimal] = None, purchaseOrderNo:Option[String] = None, exemptionNo:Option[String] = None, addresses:Option[AddressesModel] = None, parameters:Map[String, String] = Map.empty, referenceCode:Option[String] = None, reportingLocationCode:Option[String] = None, commit:Option[Boolean] = None, batchCode:Option[String] = None, taxOverride:Option[TaxOverrideModel] = None, currencyCode:Option[String] = None, serviceMode:Option[ServiceMode] = None, exchangeRate:Option[BigDecimal] = None, exchangeRateEffectiveDate:Option[Date] = None, posLaneCode:Option[String] = None, businessIdentificationNo:Option[String] = None, isSellerImporterOfRecord:Option[Boolean] = None, description:Option[String] = None, email:Option[String] = None, debugLevel:Option[TaxDebugLevel] = None) {
  def withCode(value:String):CreateTransactionModel = copy(code = Some(value))
  def withLines(value:List[LineItemModel]):CreateTransactionModel = copy(lines = value)
  def withType(value:DocumentType):CreateTransactionModel = copy(`type` = Some(value))
  def withCompanyCode(value:String):CreateTransactionModel = copy(companyCode = Some(value))
  def withDate(value:Date):CreateTransactionModel = copy(date = Some(value))
  def withSalespersonCode(value:String):CreateTransactionModel = copy(salespersonCode = Some(value))
  def withCustomerCode(value:String):CreateTransactionModel = copy(customerCode = Some(value))
  def withCustomerUsageType(value:String):CreateTransactionModel = copy(customerUsageType = Some(value))
  def withEntityUseCode(value:String):CreateTransactionModel = copy(entityUseCode = Some(value))
  def withDiscount(value:BigDecimal):CreateTransactionModel = copy(discount = Some(value))
  def withPurchaseOrderNo(value:String):CreateTransactionModel = copy(purchaseOrderNo = Some(value))
  def withExemptionNo(value:String):CreateTransactionModel = copy(exemptionNo = Some(value))
  def withAddresses(value:AddressesModel):CreateTransactionModel = copy(addresses = Some(value))
  def withParameters(value:Map[String, String]):CreateTransactionModel = copy(parameters = value)
  def withReferenceCode(value:String):CreateTransactionModel = copy(referenceCode = Some(value))
  def withReportingLocationCode(value:String):CreateTransactionModel = copy(reportingLocationCode = Some(value))
  def withCommit(value:Boolean):CreateTransactionModel = copy(commit = Some(value))
  def withBatchCode(value:String):CreateTransactionModel = copy(batchCode = Some(value))
  def withTaxOverride(value:TaxOverrideModel):CreateTransactionModel = copy(taxOverride = Some(value))
  def withCurrencyCode(value:String):CreateTransactionModel = copy(currencyCode = Some(value))
  def withServiceMode(value:ServiceMode):CreateTransactionModel = copy(serviceMode = Some(value))
  def withExchangeRate(value:BigDecimal):CreateTransactionModel = copy(exchangeRate = Some(value))
  def withExchangeRateEffectiveDate(value:Date):CreateTransactionModel = copy(exchangeRateEffectiveDate = Some(value))
  def withPosLaneCode(value:String):CreateTransactionModel = copy(posLaneCode = Some(value))
  def withBusinessIdentificationNo(value:String):CreateTransactionModel = copy(businessIdentificationNo = Some(value))
  def withIsSellerImporterOfRecord(value:Boolean):CreateTransactionModel = copy(isSellerImporterOfRecord = Some(value))
  def withDescription(value:String):CreateTransactionModel = copy(description = Some(value))
  def withEmail(value:String):CreateTransactionModel = copy(email = Some(value))
  def withDebugLevel(value:TaxDebugLevel):CreateTransactionModel = copy(debugLevel = Some(value))
}
  
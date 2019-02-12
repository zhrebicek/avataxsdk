package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class MultiDocumentLineItemModel(companyCode:Option[String] = None, reportingLocationCode:Option[String] = None, number:Option[String] = None, quantity:Option[BigDecimal] = None, amount:Option[BigDecimal] = None, addresses:Option[AddressesModel] = None, taxCode:Option[String] = None, customerUsageType:Option[String] = None, entityUseCode:Option[String] = None, itemCode:Option[String] = None, exemptionCode:Option[String] = None, discounted:Option[Boolean] = None, taxIncluded:Option[Boolean] = None, revenueAccount:Option[String] = None, ref1:Option[String] = None, ref2:Option[String] = None, description:Option[String] = None, businessIdentificationNo:Option[String] = None, taxOverride:Option[TaxOverrideModel] = None, parameters:Map[String, String] = Map.empty, hsCode:Option[String] = None) {
  def withCompanyCode(value:String):MultiDocumentLineItemModel = copy(companyCode = Some(value))
  def withReportingLocationCode(value:String):MultiDocumentLineItemModel = copy(reportingLocationCode = Some(value))
  def withNumber(value:String):MultiDocumentLineItemModel = copy(number = Some(value))
  def withQuantity(value:BigDecimal):MultiDocumentLineItemModel = copy(quantity = Some(value))
  def withAmount(value:BigDecimal):MultiDocumentLineItemModel = copy(amount = Some(value))
  def withAddresses(value:AddressesModel):MultiDocumentLineItemModel = copy(addresses = Some(value))
  def withTaxCode(value:String):MultiDocumentLineItemModel = copy(taxCode = Some(value))
  def withCustomerUsageType(value:String):MultiDocumentLineItemModel = copy(customerUsageType = Some(value))
  def withEntityUseCode(value:String):MultiDocumentLineItemModel = copy(entityUseCode = Some(value))
  def withItemCode(value:String):MultiDocumentLineItemModel = copy(itemCode = Some(value))
  def withExemptionCode(value:String):MultiDocumentLineItemModel = copy(exemptionCode = Some(value))
  def withDiscounted(value:Boolean):MultiDocumentLineItemModel = copy(discounted = Some(value))
  def withTaxIncluded(value:Boolean):MultiDocumentLineItemModel = copy(taxIncluded = Some(value))
  def withRevenueAccount(value:String):MultiDocumentLineItemModel = copy(revenueAccount = Some(value))
  def withRef1(value:String):MultiDocumentLineItemModel = copy(ref1 = Some(value))
  def withRef2(value:String):MultiDocumentLineItemModel = copy(ref2 = Some(value))
  def withDescription(value:String):MultiDocumentLineItemModel = copy(description = Some(value))
  def withBusinessIdentificationNo(value:String):MultiDocumentLineItemModel = copy(businessIdentificationNo = Some(value))
  def withTaxOverride(value:TaxOverrideModel):MultiDocumentLineItemModel = copy(taxOverride = Some(value))
  def withParameters(value:Map[String, String]):MultiDocumentLineItemModel = copy(parameters = value)
  def withHsCode(value:String):MultiDocumentLineItemModel = copy(hsCode = Some(value))
}
  
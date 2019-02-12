package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LineItemModel(number:Option[String] = None, quantity:Option[BigDecimal] = None, amount:Option[BigDecimal] = None, addresses:Option[AddressesModel] = None, taxCode:Option[String] = None, customerUsageType:Option[String] = None, entityUseCode:Option[String] = None, itemCode:Option[String] = None, exemptionCode:Option[String] = None, discounted:Option[Boolean] = None, taxIncluded:Option[Boolean] = None, revenueAccount:Option[String] = None, ref1:Option[String] = None, ref2:Option[String] = None, description:Option[String] = None, businessIdentificationNo:Option[String] = None, taxOverride:Option[TaxOverrideModel] = None, parameters:Map[String, String] = Map.empty, hsCode:Option[String] = None) {
  def withNumber(value:String):LineItemModel = copy(number = Some(value))
  def withQuantity(value:BigDecimal):LineItemModel = copy(quantity = Some(value))
  def withAmount(value:BigDecimal):LineItemModel = copy(amount = Some(value))
  def withAddresses(value:AddressesModel):LineItemModel = copy(addresses = Some(value))
  def withTaxCode(value:String):LineItemModel = copy(taxCode = Some(value))
  def withCustomerUsageType(value:String):LineItemModel = copy(customerUsageType = Some(value))
  def withEntityUseCode(value:String):LineItemModel = copy(entityUseCode = Some(value))
  def withItemCode(value:String):LineItemModel = copy(itemCode = Some(value))
  def withExemptionCode(value:String):LineItemModel = copy(exemptionCode = Some(value))
  def withDiscounted(value:Boolean):LineItemModel = copy(discounted = Some(value))
  def withTaxIncluded(value:Boolean):LineItemModel = copy(taxIncluded = Some(value))
  def withRevenueAccount(value:String):LineItemModel = copy(revenueAccount = Some(value))
  def withRef1(value:String):LineItemModel = copy(ref1 = Some(value))
  def withRef2(value:String):LineItemModel = copy(ref2 = Some(value))
  def withDescription(value:String):LineItemModel = copy(description = Some(value))
  def withBusinessIdentificationNo(value:String):LineItemModel = copy(businessIdentificationNo = Some(value))
  def withTaxOverride(value:TaxOverrideModel):LineItemModel = copy(taxOverride = Some(value))
  def withParameters(value:Map[String, String]):LineItemModel = copy(parameters = value)
  def withHsCode(value:String):LineItemModel = copy(hsCode = Some(value))
}
  
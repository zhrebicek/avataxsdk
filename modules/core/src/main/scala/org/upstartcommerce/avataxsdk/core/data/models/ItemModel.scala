package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemModel(id:Option[Long] = None, companyId:Option[Int] = None, itemCode:Option[String] = None, taxCodeId:Option[Int] = None, taxCode:Option[String] = None, description:Option[String] = None, itemGroup:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, classifications:List[ClassificationModel] = List.empty, parameters:List[ItemParameterModel] = List.empty) {
  def withId(value:Long):ItemModel = copy(id = Some(value))
  def withCompanyId(value:Int):ItemModel = copy(companyId = Some(value))
  def withItemCode(value:String):ItemModel = copy(itemCode = Some(value))
  def withTaxCodeId(value:Int):ItemModel = copy(taxCodeId = Some(value))
  def withTaxCode(value:String):ItemModel = copy(taxCode = Some(value))
  def withDescription(value:String):ItemModel = copy(description = Some(value))
  def withItemGroup(value:String):ItemModel = copy(itemGroup = Some(value))
  def withCreatedDate(value:Date):ItemModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):ItemModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):ItemModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):ItemModel = copy(modifiedUserId = Some(value))
  def withClassifications(value:List[ClassificationModel]):ItemModel = copy(classifications = value)
  def withParameters(value:List[ItemParameterModel]):ItemModel = copy(parameters = value)
}
  
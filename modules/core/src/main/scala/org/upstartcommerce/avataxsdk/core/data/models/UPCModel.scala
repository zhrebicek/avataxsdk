package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UPCModel(id:Option[Int] = None, companyId:Option[Int] = None, upc:Option[String] = None, legacyTaxCode:Option[String] = None, description:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, usage:Option[Int] = None, isSystem:Option[Int] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {

  def withId(value:Int):UPCModel = copy(id = Some(value))
  def withCompanyId(value:Int):UPCModel = copy(companyId = Some(value))
  def withUpc(value:String):UPCModel = copy(upc = Some(value))
  def withLegacyTaxCode(value:String):UPCModel = copy(legacyTaxCode = Some(value))
  def withDescription(value:String):UPCModel = copy(description = Some(value))
  def withEffectiveDate(value:Date):UPCModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):UPCModel = copy(endDate = Some(value))
  def withUsage(value:Int):UPCModel = copy(usage = Some(value))
  def withIsSystem(value:Int):UPCModel = copy(isSystem = Some(value))
  def withCreatedDate(value:Date):UPCModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):UPCModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):UPCModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):UPCModel = copy(modifiedUserId = Some(value))
}
  
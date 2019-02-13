package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingModel(id:Option[Long] = None, companyId:Option[Int] = None, month:Option[Int] = None, year:Option[Short] = None, `type`:Option[WorksheetTypeId] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, filingRegions:Option[List[FilingRegionModel]] = None) {
  lazy val filingRegionsRaw:List[FilingRegionModel] = filingRegions.getOrElse(List.empty)
  def withId(value:Long):FilingModel = copy(id = Some(value))
  def withCompanyId(value:Int):FilingModel = copy(companyId = Some(value))
  def withMonth(value:Int):FilingModel = copy(month = Some(value))
  def withYear(value:Short):FilingModel = copy(year = Some(value))
  def withType(value:WorksheetTypeId):FilingModel = copy(`type` = Some(value))
  def withCreatedDate(value:Date):FilingModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):FilingModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):FilingModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):FilingModel = copy(modifiedUserId = Some(value))
  def withFilingRegions(value:List[FilingRegionModel]):FilingModel = copy(filingRegions = Some(value))
}
  
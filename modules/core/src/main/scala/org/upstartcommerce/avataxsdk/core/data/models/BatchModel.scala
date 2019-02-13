package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class BatchModel(id:Option[Int] = None, name:Option[String] = None, accountId:Option[Int] = None, companyId:Option[Int] = None, `type`:Option[BatchType] = None, status:Option[BatchStatus] = None, options:Option[String] = None, batchAgent:Option[String] = None, startedDate:Option[Date] = None, recordCount:Option[Int] = None, currentRecord:Option[Int] = None, completedDate:Option[Date] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, files:Option[List[BatchFileModel]] = None) {
  lazy val filesRaw:List[BatchFileModel] = files.getOrElse(List.empty)
  def withId(value:Int):BatchModel = copy(id = Some(value))
  def withName(value:String):BatchModel = copy(name = Some(value))
  def withAccountId(value:Int):BatchModel = copy(accountId = Some(value))
  def withCompanyId(value:Int):BatchModel = copy(companyId = Some(value))
  def withType(value:BatchType):BatchModel = copy(`type` = Some(value))
  def withStatus(value:BatchStatus):BatchModel = copy(status = Some(value))
  def withOptions(value:String):BatchModel = copy(options = Some(value))
  def withBatchAgent(value:String):BatchModel = copy(batchAgent = Some(value))
  def withStartedDate(value:Date):BatchModel = copy(startedDate = Some(value))
  def withRecordCount(value:Int):BatchModel = copy(recordCount = Some(value))
  def withCurrentRecord(value:Int):BatchModel = copy(currentRecord = Some(value))
  def withCompletedDate(value:Date):BatchModel = copy(completedDate = Some(value))
  def withCreatedDate(value:Date):BatchModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):BatchModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):BatchModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):BatchModel = copy(modifiedUserId = Some(value))
  def withFiles(value:List[BatchFileModel]):BatchModel = copy(files = Some(value))
}
  
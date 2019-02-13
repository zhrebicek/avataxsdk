package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class BatchFileModel(id:Option[Int] = None, batchId:Option[Int] = None, name:Option[String] = None, content:Option[String] = None, contentLength:Option[Int] = None, contentType:Option[String] = None, fileExtension:Option[String] = None, filePath:Option[String] = None, errorCount:Option[Int] = None) {

  def withId(value:Int):BatchFileModel = copy(id = Some(value))
  def withBatchId(value:Int):BatchFileModel = copy(batchId = Some(value))
  def withName(value:String):BatchFileModel = copy(name = Some(value))
  def withContent(value:String):BatchFileModel = copy(content = Some(value))
  def withContentLength(value:Int):BatchFileModel = copy(contentLength = Some(value))
  def withContentType(value:String):BatchFileModel = copy(contentType = Some(value))
  def withFileExtension(value:String):BatchFileModel = copy(fileExtension = Some(value))
  def withFilePath(value:String):BatchFileModel = copy(filePath = Some(value))
  def withErrorCount(value:Int):BatchFileModel = copy(errorCount = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FileContentResult(fileContents:Option[String] = None, contentType:Option[String] = None, fileDownloadName:Option[String] = None) {
  def withFileContents(value:String):FileContentResult = copy(fileContents = Some(value))
  def withContentType(value:String):FileContentResult = copy(contentType = Some(value))
  def withFileDownloadName(value:String):FileContentResult = copy(fileDownloadName = Some(value))
}
  
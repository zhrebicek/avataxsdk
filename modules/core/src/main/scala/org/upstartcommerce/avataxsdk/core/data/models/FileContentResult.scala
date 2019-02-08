package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FileContentResult(fileContents:Option[String] = None, contentType:Option[String] = None, fileDownloadName:Option[String] = None)
  
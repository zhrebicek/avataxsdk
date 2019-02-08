package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class BatchFileModel(id:Option[Int] = None, batchId:Option[Int] = None, name:Option[String] = None, content:Option[String] = None, contentLength:Option[Int] = None, contentType:Option[String] = None, fileExtension:Option[String] = None, filePath:Option[String] = None, errorCount:Option[Int] = None)
  
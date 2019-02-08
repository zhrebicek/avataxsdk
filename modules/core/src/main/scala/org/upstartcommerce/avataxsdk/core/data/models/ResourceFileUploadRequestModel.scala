package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ResourceFileUploadRequestModel(content:Option[Byte] = None, username:Option[String] = None, accountId:Option[Int] = None, companyId:Option[Int] = None, name:Option[String] = None, resourceFileTypeId:Option[Int] = None, length:Option[Long] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ResourceFileUploadRequestModel(content:Option[Byte] = None, username:Option[String] = None, accountId:Option[Int] = None, companyId:Option[Int] = None, name:Option[String] = None, resourceFileTypeId:Option[Int] = None, length:Option[Long] = None) {

  def withContent(value:Byte):ResourceFileUploadRequestModel = copy(content = Some(value))
  def withUsername(value:String):ResourceFileUploadRequestModel = copy(username = Some(value))
  def withAccountId(value:Int):ResourceFileUploadRequestModel = copy(accountId = Some(value))
  def withCompanyId(value:Int):ResourceFileUploadRequestModel = copy(companyId = Some(value))
  def withName(value:String):ResourceFileUploadRequestModel = copy(name = Some(value))
  def withResourceFileTypeId(value:Int):ResourceFileUploadRequestModel = copy(resourceFileTypeId = Some(value))
  def withLength(value:Long):ResourceFileUploadRequestModel = copy(length = Some(value))
}
  
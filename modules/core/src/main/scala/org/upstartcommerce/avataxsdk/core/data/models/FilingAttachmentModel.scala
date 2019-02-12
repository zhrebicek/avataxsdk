package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAttachmentModel(resourceFileId:Option[Int] = None, description:Option[String] = None) {
  def withResourceFileId(value:Int):FilingAttachmentModel = copy(resourceFileId = Some(value))
  def withDescription(value:String):FilingAttachmentModel = copy(description = Some(value))
}
  
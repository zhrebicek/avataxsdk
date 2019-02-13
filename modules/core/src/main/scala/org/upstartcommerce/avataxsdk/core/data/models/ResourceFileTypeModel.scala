package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ResourceFileTypeModel(resourceFileTypeId:Option[Int] = None, name:Option[String] = None) {

  def withResourceFileTypeId(value:Int):ResourceFileTypeModel = copy(resourceFileTypeId = Some(value))
  def withName(value:String):ResourceFileTypeModel = copy(name = Some(value))
}
  
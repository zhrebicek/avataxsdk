package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CustomFieldModel(name:Option[String] = None, value:Option[String] = None) {

  def withName(value:String):CustomFieldModel = copy(name = Some(value))
  def withValue(value:String):CustomFieldModel = copy(value = Some(value))
}
  
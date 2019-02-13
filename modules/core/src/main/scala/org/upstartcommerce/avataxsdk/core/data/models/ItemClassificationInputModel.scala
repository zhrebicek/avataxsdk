package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemClassificationInputModel(productCode:Option[String] = None, systemCode:Option[String] = None) {

  def withProductCode(value:String):ItemClassificationInputModel = copy(productCode = Some(value))
  def withSystemCode(value:String):ItemClassificationInputModel = copy(systemCode = Some(value))
}
  
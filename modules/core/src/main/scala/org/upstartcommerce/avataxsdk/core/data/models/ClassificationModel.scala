package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ClassificationModel(productCode:Option[String] = None, systemCode:Option[String] = None) {
  def withProductCode(value:String):ClassificationModel = copy(productCode = Some(value))
  def withSystemCode(value:String):ClassificationModel = copy(systemCode = Some(value))
}
  
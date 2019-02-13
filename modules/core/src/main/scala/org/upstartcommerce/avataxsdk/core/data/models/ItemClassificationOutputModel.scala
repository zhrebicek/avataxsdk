package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemClassificationOutputModel(id:Option[Long] = None, itemId:Option[Long] = None, systemId:Option[Int] = None, productCode:Option[String] = None, systemCode:Option[String] = None) {

  def withId(value:Long):ItemClassificationOutputModel = copy(id = Some(value))
  def withItemId(value:Long):ItemClassificationOutputModel = copy(itemId = Some(value))
  def withSystemId(value:Int):ItemClassificationOutputModel = copy(systemId = Some(value))
  def withProductCode(value:String):ItemClassificationOutputModel = copy(productCode = Some(value))
  def withSystemCode(value:String):ItemClassificationOutputModel = copy(systemCode = Some(value))
}
  
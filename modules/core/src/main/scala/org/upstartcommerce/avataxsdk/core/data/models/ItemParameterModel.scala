package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemParameterModel(id:Option[Long] = None, name:Option[String] = None, value:Option[String] = None, unit:Option[String] = None, itemId:Option[Long] = None) {
  def withId(value:Long):ItemParameterModel = copy(id = Some(value))
  def withName(value:String):ItemParameterModel = copy(name = Some(value))
  def withValue(value:String):ItemParameterModel = copy(value = Some(value))
  def withUnit(value:String):ItemParameterModel = copy(unit = Some(value))
  def withItemId(value:Long):ItemParameterModel = copy(itemId = Some(value))
}
  
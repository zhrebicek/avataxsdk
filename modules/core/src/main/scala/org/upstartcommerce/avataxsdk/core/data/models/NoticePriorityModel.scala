package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticePriorityModel(id:Option[Int] = None, description:Option[String] = None, activeFlag:Option[Boolean] = None, sortOrder:Option[Int] = None) {
  def withId(value:Int):NoticePriorityModel = copy(id = Some(value))
  def withDescription(value:String):NoticePriorityModel = copy(description = Some(value))
  def withActiveFlag(value:Boolean):NoticePriorityModel = copy(activeFlag = Some(value))
  def withSortOrder(value:Int):NoticePriorityModel = copy(sortOrder = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeTypeModel(id:Option[Int] = None, description:Option[String] = None, activeFlag:Option[Boolean] = None, sortOrder:Option[Int] = None) {

  def withId(value:Int):NoticeTypeModel = copy(id = Some(value))
  def withDescription(value:String):NoticeTypeModel = copy(description = Some(value))
  def withActiveFlag(value:Boolean):NoticeTypeModel = copy(activeFlag = Some(value))
  def withSortOrder(value:Int):NoticeTypeModel = copy(sortOrder = Some(value))
}
  
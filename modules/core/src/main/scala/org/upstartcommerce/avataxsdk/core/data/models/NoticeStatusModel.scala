package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeStatusModel(id:Option[Int] = None, description:Option[String] = None, isOpen:Option[Boolean] = None, sortOrder:Option[Int] = None) {
  def withId(value:Int):NoticeStatusModel = copy(id = Some(value))
  def withDescription(value:String):NoticeStatusModel = copy(description = Some(value))
  def withIsOpen(value:Boolean):NoticeStatusModel = copy(isOpen = Some(value))
  def withSortOrder(value:Int):NoticeStatusModel = copy(sortOrder = Some(value))
}
  
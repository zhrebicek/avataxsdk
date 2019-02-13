package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeReasonModel(id:Option[Int] = None, description:Option[String] = None, activeFlag:Option[Boolean] = None, sortOrder:Option[Int] = None) {

  def withId(value:Int):NoticeReasonModel = copy(id = Some(value))
  def withDescription(value:String):NoticeReasonModel = copy(description = Some(value))
  def withActiveFlag(value:Boolean):NoticeReasonModel = copy(activeFlag = Some(value))
  def withSortOrder(value:Int):NoticeReasonModel = copy(sortOrder = Some(value))
}
  
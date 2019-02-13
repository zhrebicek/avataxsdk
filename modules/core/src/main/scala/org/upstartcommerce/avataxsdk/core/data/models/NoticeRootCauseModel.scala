package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeRootCauseModel(id:Option[Int] = None, description:Option[String] = None, isActive:Option[Boolean] = None, sortOrder:Option[Int] = None) {

  def withId(value:Int):NoticeRootCauseModel = copy(id = Some(value))
  def withDescription(value:String):NoticeRootCauseModel = copy(description = Some(value))
  def withIsActive(value:Boolean):NoticeRootCauseModel = copy(isActive = Some(value))
  def withSortOrder(value:Int):NoticeRootCauseModel = copy(sortOrder = Some(value))
}
  
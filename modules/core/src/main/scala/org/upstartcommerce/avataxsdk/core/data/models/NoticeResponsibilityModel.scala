package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeResponsibilityModel(id:Option[Int] = None, description:Option[String] = None, isActive:Option[Boolean] = None, sortOrder:Option[Int] = None) {

  def withId(value:Int):NoticeResponsibilityModel = copy(id = Some(value))
  def withDescription(value:String):NoticeResponsibilityModel = copy(description = Some(value))
  def withIsActive(value:Boolean):NoticeResponsibilityModel = copy(isActive = Some(value))
  def withSortOrder(value:Int):NoticeResponsibilityModel = copy(sortOrder = Some(value))
}
  
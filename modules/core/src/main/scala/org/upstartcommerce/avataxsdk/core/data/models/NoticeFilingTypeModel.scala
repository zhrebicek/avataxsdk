package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeFilingTypeModel(id:Option[Int] = None, description:Option[String] = None, activeFlag:Option[Boolean] = None, sortOrder:Option[Int] = None) {

  def withId(value:Int):NoticeFilingTypeModel = copy(id = Some(value))
  def withDescription(value:String):NoticeFilingTypeModel = copy(description = Some(value))
  def withActiveFlag(value:Boolean):NoticeFilingTypeModel = copy(activeFlag = Some(value))
  def withSortOrder(value:Int):NoticeFilingTypeModel = copy(sortOrder = Some(value))
}
  
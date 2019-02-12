package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeCustomerTypeModel(id:Option[Int] = None, description:Option[String] = None, activeFlag:Option[Boolean] = None, sortOrder:Option[Int] = None) {
  def withId(value:Int):NoticeCustomerTypeModel = copy(id = Some(value))
  def withDescription(value:String):NoticeCustomerTypeModel = copy(description = Some(value))
  def withActiveFlag(value:Boolean):NoticeCustomerTypeModel = copy(activeFlag = Some(value))
  def withSortOrder(value:Int):NoticeCustomerTypeModel = copy(sortOrder = Some(value))
}
  
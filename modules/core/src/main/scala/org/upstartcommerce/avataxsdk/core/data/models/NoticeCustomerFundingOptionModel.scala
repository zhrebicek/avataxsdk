package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeCustomerFundingOptionModel(id:Option[Int] = None, description:Option[String] = None, activeFlag:Option[Boolean] = None, sortOrder:Option[Int] = None) {
  def withId(value:Int):NoticeCustomerFundingOptionModel = copy(id = Some(value))
  def withDescription(value:String):NoticeCustomerFundingOptionModel = copy(description = Some(value))
  def withActiveFlag(value:Boolean):NoticeCustomerFundingOptionModel = copy(activeFlag = Some(value))
  def withSortOrder(value:Int):NoticeCustomerFundingOptionModel = copy(sortOrder = Some(value))
}
  
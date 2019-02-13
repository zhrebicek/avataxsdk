package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CycleEditOptionModel(success:Option[Boolean] = None, message:Option[String] = None, customerMustApprove:Option[Boolean] = None, mustCloneFilingCalendar:Option[Boolean] = None, clonedCalendarEffDate:Option[Date] = None, expiredCalendarEndDate:Option[Date] = None) {

  def withSuccess(value:Boolean):CycleEditOptionModel = copy(success = Some(value))
  def withMessage(value:String):CycleEditOptionModel = copy(message = Some(value))
  def withCustomerMustApprove(value:Boolean):CycleEditOptionModel = copy(customerMustApprove = Some(value))
  def withMustCloneFilingCalendar(value:Boolean):CycleEditOptionModel = copy(mustCloneFilingCalendar = Some(value))
  def withClonedCalendarEffDate(value:Date):CycleEditOptionModel = copy(clonedCalendarEffDate = Some(value))
  def withExpiredCalendarEndDate(value:Date):CycleEditOptionModel = copy(expiredCalendarEndDate = Some(value))
}
  
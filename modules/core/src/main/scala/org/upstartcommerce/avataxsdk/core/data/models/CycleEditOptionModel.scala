package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CycleEditOptionModel(success:Option[Boolean] = None, message:Option[String] = None, customerMustApprove:Option[Boolean] = None, mustCloneFilingCalendar:Option[Boolean] = None, clonedCalendarEffDate:Option[Date] = None, expiredCalendarEndDate:Option[Date] = None)
  
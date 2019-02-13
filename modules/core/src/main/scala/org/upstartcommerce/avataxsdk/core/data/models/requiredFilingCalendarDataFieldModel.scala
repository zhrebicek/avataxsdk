package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class requiredFilingCalendarDataFieldModel(name:Option[String] = None, description:Option[String] = None) {

  def withName(value:String):requiredFilingCalendarDataFieldModel = copy(name = Some(value))
  def withDescription(value:String):requiredFilingCalendarDataFieldModel = copy(description = Some(value))
}
  
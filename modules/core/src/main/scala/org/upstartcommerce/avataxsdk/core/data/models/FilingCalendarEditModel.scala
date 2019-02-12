package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingCalendarEditModel(fieldName:Option[String] = None, questionId:Option[Int] = None, oldValue:Map[String, String] = Map.empty, newValue:Map[String, String] = Map.empty) {
  def withFieldName(value:String):FilingCalendarEditModel = copy(fieldName = Some(value))
  def withQuestionId(value:Int):FilingCalendarEditModel = copy(questionId = Some(value))
  def withOldValue(value:Map[String, String]):FilingCalendarEditModel = copy(oldValue = value)
  def withNewValue(value:Map[String, String]):FilingCalendarEditModel = copy(newValue = value)
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingCalendarEditModel(fieldName:Option[String] = None, questionId:Option[Int] = None, oldValue:Option[Map[String, String]] = None, newValue:Option[Map[String, String]] = None) {
  lazy val oldValueRaw:Map[String, String] = oldValue.getOrElse(Map.empty)
  lazy val newValueRaw:Map[String, String] = newValue.getOrElse(Map.empty)
  def withFieldName(value:String):FilingCalendarEditModel = copy(fieldName = Some(value))
  def withQuestionId(value:Int):FilingCalendarEditModel = copy(questionId = Some(value))
  def withOldValue(value:Map[String, String]):FilingCalendarEditModel = copy(oldValue = Some(value))
  def withNewValue(value:Map[String, String]):FilingCalendarEditModel = copy(newValue = Some(value))
}
  
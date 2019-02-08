package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingCalendarEditModel(fieldName:Option[String] = None, questionId:Option[Int] = None, oldValue:Option[Map[String, String]] = None, newValue:Option[Map[String, String]] = None)
  
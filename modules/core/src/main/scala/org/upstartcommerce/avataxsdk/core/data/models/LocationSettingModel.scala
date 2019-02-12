package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LocationSettingModel(questionId:Option[Int] = None, questionName:Option[String] = None, value:Option[String] = None) {
  def withQuestionId(value:Int):LocationSettingModel = copy(questionId = Some(value))
  def withQuestionName(value:String):LocationSettingModel = copy(questionName = Some(value))
  def withValue(value:String):LocationSettingModel = copy(value = Some(value))
}
  
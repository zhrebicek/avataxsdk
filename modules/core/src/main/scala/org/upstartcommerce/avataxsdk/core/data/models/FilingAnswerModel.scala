package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAnswerModel(filingQuestionId:Option[Long] = None, answer:Map[String, String] = Map.empty) {
  def withFilingQuestionId(value:Long):FilingAnswerModel = copy(filingQuestionId = Some(value))
  def withAnswer(value:Map[String, String]):FilingAnswerModel = copy(answer = value)
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAnswerModel(filingQuestionId:Option[Long] = None, answer:Option[Map[String, String]] = None) {
  lazy val answerRaw:Map[String, String] = answer.getOrElse(Map.empty)
  def withFilingQuestionId(value:Long):FilingAnswerModel = copy(filingQuestionId = Some(value))
  def withAnswer(value:Map[String, String]):FilingAnswerModel = copy(answer = Some(value))
}
  
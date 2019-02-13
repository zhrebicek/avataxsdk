package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAnswer(filingQuestionId:Option[Long] = None, answer:Option[Map[String, String]] = None) {
  lazy val answerRaw:Map[String, String] = answer.getOrElse(Map.empty)
  def withFilingQuestionId(value:Long):FilingAnswer = copy(filingQuestionId = Some(value))
  def withAnswer(value:Map[String, String]):FilingAnswer = copy(answer = Some(value))
}
  
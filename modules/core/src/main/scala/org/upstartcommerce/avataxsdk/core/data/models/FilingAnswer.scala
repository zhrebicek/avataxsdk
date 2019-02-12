package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAnswer(filingQuestionId:Option[Long] = None, answer:Map[String, String] = Map.empty) {
  def withFilingQuestionId(value:Long):FilingAnswer = copy(filingQuestionId = Some(value))
  def withAnswer(value:Map[String, String]):FilingAnswer = copy(answer = value)
}
  
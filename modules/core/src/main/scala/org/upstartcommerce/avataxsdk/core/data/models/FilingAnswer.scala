package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAnswer(filingQuestionId:Option[Long] = None, answer:Option[Map[String, String]] = None)
  
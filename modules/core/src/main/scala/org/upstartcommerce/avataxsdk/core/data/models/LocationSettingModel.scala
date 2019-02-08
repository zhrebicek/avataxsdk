package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LocationSettingModel(questionId:Option[Int] = None, questionName:Option[String] = None, value:Option[String] = None)
  
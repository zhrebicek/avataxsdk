package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LocationValidationModel(settingsValidated:Option[Boolean] = None, requiredSettings:Option[List[LocationQuestionModel]] = None)
  
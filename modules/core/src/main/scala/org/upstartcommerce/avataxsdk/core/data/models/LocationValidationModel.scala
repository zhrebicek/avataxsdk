package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LocationValidationModel(settingsValidated:Option[Boolean] = None, requiredSettings:List[LocationQuestionModel] = List.empty) {
  def withSettingsValidated(value:Boolean):LocationValidationModel = copy(settingsValidated = Some(value))
  def withRequiredSettings(value:List[LocationQuestionModel]):LocationValidationModel = copy(requiredSettings = value)
}
  
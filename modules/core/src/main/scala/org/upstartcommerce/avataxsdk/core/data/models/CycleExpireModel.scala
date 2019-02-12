package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CycleExpireModel(success:Option[Boolean] = None, message:Option[String] = None, cycleExpirationOptions:List[CycleExpireOptionModel] = List.empty) {
  def withSuccess(value:Boolean):CycleExpireModel = copy(success = Some(value))
  def withMessage(value:String):CycleExpireModel = copy(message = Some(value))
  def withCycleExpirationOptions(value:List[CycleExpireOptionModel]):CycleExpireModel = copy(cycleExpirationOptions = value)
}
  
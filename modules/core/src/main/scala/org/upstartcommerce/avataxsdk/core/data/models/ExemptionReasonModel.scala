package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ExemptionReasonModel(id:Option[Int] = None, name:Option[String] = None) {

  def withId(value:Int):ExemptionReasonModel = copy(id = Some(value))
  def withName(value:String):ExemptionReasonModel = copy(name = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingFrequencyModel(id:Option[Int] = None, description:Option[String] = None) {

  def withId(value:Int):FilingFrequencyModel = copy(id = Some(value))
  def withDescription(value:String):FilingFrequencyModel = copy(description = Some(value))
}
  
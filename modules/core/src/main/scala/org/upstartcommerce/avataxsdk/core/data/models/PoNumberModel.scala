package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PoNumberModel(id:Option[Int] = None, poNumber:Option[String] = None) {

  def withId(value:Int):PoNumberModel = copy(id = Some(value))
  def withPoNumber(value:String):PoNumberModel = copy(poNumber = Some(value))
}
  
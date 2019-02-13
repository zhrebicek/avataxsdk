package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SubscriptionTypeModel(id:Option[Int] = None, description:Option[String] = None) {

  def withId(value:Int):SubscriptionTypeModel = copy(id = Some(value))
  def withDescription(value:String):SubscriptionTypeModel = copy(description = Some(value))
}
  
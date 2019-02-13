package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UsernameModel(username:Option[String] = None, taken:Option[Boolean] = None) {

  def withUsername(value:String):UsernameModel = copy(username = Some(value))
  def withTaken(value:Boolean):UsernameModel = copy(taken = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SetPasswordModel(newPassword:Option[String] = None) {
  def withNewPassword(value:String):SetPasswordModel = copy(newPassword = Some(value))
}
  
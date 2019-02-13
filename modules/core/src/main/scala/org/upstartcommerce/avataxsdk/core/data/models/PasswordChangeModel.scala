package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PasswordChangeModel(oldPassword:Option[String] = None, newPassword:Option[String] = None) {

  def withOldPassword(value:String):PasswordChangeModel = copy(oldPassword = Some(value))
  def withNewPassword(value:String):PasswordChangeModel = copy(newPassword = Some(value))
}
  
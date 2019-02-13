package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ChangeTransactionCodeModel(newCode:Option[String] = None) {

  def withNewCode(value:String):ChangeTransactionCodeModel = copy(newCode = Some(value))
}
  
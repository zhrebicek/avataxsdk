package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class VoidTransactionModel(code:Option[VoidReasonCode] = None) {
  def withCode(value:VoidReasonCode):VoidTransactionModel = copy(code = Some(value))
}
  
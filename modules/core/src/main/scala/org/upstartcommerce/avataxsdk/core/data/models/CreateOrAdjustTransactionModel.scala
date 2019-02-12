package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CreateOrAdjustTransactionModel(createTransactionModel:Option[CreateTransactionModel] = None) {
  def withCreateTransactionModel(value:CreateTransactionModel):CreateOrAdjustTransactionModel = copy(createTransactionModel = Some(value))
}
  
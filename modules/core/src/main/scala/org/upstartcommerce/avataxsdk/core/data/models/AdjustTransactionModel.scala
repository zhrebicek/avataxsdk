package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AdjustTransactionModel(adjustmentReason:Option[AdjustmentReason] = None, adjustmentDescription:Option[String] = None, newTransaction:Option[CreateTransactionModel] = None) {

  def withAdjustmentReason(value:AdjustmentReason):AdjustTransactionModel = copy(adjustmentReason = Some(value))
  def withAdjustmentDescription(value:String):AdjustTransactionModel = copy(adjustmentDescription = Some(value))
  def withNewTransaction(value:CreateTransactionModel):AdjustTransactionModel = copy(newTransaction = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AdjustMultiDocumentModel(adjustmentReason:Option[AdjustmentReason] = None, adjustDescription:Option[String] = None, newTransaction:Option[CreateMultiDocumentModel] = None) {
  def withAdjustmentReason(value:AdjustmentReason):AdjustMultiDocumentModel = copy(adjustmentReason = Some(value))
  def withAdjustDescription(value:String):AdjustMultiDocumentModel = copy(adjustDescription = Some(value))
  def withNewTransaction(value:CreateMultiDocumentModel):AdjustMultiDocumentModel = copy(newTransaction = Some(value))
}
  
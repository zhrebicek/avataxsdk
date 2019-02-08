package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AdjustTransactionModel(adjustmentReason:Option[AdjustmentReason] = None, adjustmentDescription:Option[String] = None, newTransaction:Option[CreateTransactionModel] = None)
  
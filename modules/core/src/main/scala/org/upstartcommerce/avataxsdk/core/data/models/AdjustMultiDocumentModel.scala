package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AdjustMultiDocumentModel(adjustmentReason:Option[AdjustmentReason] = None, adjustDescription:Option[String] = None, newTransaction:Option[CreateMultiDocumentModel] = None)
  
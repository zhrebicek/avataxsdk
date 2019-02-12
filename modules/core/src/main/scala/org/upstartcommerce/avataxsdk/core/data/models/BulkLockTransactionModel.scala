package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class BulkLockTransactionModel(documentIds:List[Long] = List.empty, isLocked:Option[Boolean] = None) {
  def withDocumentIds(value:List[Long]):BulkLockTransactionModel = copy(documentIds = value)
  def withIsLocked(value:Boolean):BulkLockTransactionModel = copy(isLocked = Some(value))
}
  
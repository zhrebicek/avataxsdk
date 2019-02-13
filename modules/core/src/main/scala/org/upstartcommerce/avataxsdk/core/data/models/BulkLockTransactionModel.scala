package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class BulkLockTransactionModel(documentIds:Option[List[Long]] = None, isLocked:Option[Boolean] = None) {
  lazy val documentIdsRaw:List[Long] = documentIds.getOrElse(List.empty)
  def withDocumentIds(value:List[Long]):BulkLockTransactionModel = copy(documentIds = Some(value))
  def withIsLocked(value:Boolean):BulkLockTransactionModel = copy(isLocked = Some(value))
}
  
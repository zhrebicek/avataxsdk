package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class BulkLockTransactionResult(numberOfRecords:Option[Int] = None) {

  def withNumberOfRecords(value:Int):BulkLockTransactionResult = copy(numberOfRecords = Some(value))
}
  
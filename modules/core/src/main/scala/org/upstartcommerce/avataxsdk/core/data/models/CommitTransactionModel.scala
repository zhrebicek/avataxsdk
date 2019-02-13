package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CommitTransactionModel(commit:Option[Boolean] = None) {

  def withCommit(value:Boolean):CommitTransactionModel = copy(commit = Some(value))
}
  
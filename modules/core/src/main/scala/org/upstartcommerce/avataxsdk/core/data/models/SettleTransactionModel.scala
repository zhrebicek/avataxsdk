package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SettleTransactionModel(verify:Option[VerifyTransactionModel] = None, changeCode:Option[ChangeTransactionCodeModel] = None, commit:Option[CommitTransactionModel] = None) {
  def withVerify(value:VerifyTransactionModel):SettleTransactionModel = copy(verify = Some(value))
  def withChangeCode(value:ChangeTransactionCodeModel):SettleTransactionModel = copy(changeCode = Some(value))
  def withCommit(value:CommitTransactionModel):SettleTransactionModel = copy(commit = Some(value))
}
  
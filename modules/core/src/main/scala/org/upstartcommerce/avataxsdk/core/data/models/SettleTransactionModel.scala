package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SettleTransactionModel(verify:Option[VerifyTransactionModel] = None, changeCode:Option[ChangeTransactionCodeModel] = None, commit:Option[CommitTransactionModel] = None)
  
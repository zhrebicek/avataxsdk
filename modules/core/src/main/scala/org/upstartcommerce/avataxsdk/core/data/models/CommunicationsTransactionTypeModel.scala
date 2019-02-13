package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CommunicationsTransactionTypeModel(transactionTypeId:Option[Int] = None, transactionType:Option[String] = None) {

  def withTransactionTypeId(value:Int):CommunicationsTransactionTypeModel = copy(transactionTypeId = Some(value))
  def withTransactionType(value:String):CommunicationsTransactionTypeModel = copy(transactionType = Some(value))
}
  
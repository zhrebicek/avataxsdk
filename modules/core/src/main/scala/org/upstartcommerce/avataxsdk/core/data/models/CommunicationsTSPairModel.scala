package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CommunicationsTSPairModel(transactionTypeId:Option[Int] = None, serviceTypeId:Option[Int] = None, transactionType:Option[String] = None, serviceType:Option[String] = None, description:Option[String] = None, requiredParameters:List[String] = List.empty) {
  def withTransactionTypeId(value:Int):CommunicationsTSPairModel = copy(transactionTypeId = Some(value))
  def withServiceTypeId(value:Int):CommunicationsTSPairModel = copy(serviceTypeId = Some(value))
  def withTransactionType(value:String):CommunicationsTSPairModel = copy(transactionType = Some(value))
  def withServiceType(value:String):CommunicationsTSPairModel = copy(serviceType = Some(value))
  def withDescription(value:String):CommunicationsTSPairModel = copy(description = Some(value))
  def withRequiredParameters(value:List[String]):CommunicationsTSPairModel = copy(requiredParameters = value)
}
  
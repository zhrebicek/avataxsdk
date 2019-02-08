package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CommunicationsTSPairModel(transactionTypeId:Option[Int] = None, serviceTypeId:Option[Int] = None, transactionType:Option[String] = None, serviceType:Option[String] = None, description:Option[String] = None, requiredParameters:Option[List[String]] = None)
  
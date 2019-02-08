package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NewAccountModel(accountId:Option[Int] = None, accountDetailsEmailedTo:Option[String] = None, createdDate:Option[Date] = None, emailedDate:Option[Date] = None, limitations:Option[String] = None, licenseKey:Option[String] = None, paymentUrl:Option[String] = None)
  
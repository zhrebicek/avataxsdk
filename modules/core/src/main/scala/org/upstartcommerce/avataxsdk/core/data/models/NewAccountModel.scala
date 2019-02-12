package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NewAccountModel(accountId:Option[Int] = None, accountDetailsEmailedTo:Option[String] = None, createdDate:Option[Date] = None, emailedDate:Option[Date] = None, limitations:Option[String] = None, licenseKey:Option[String] = None, paymentUrl:Option[String] = None) {
  def withAccountId(value:Int):NewAccountModel = copy(accountId = Some(value))
  def withAccountDetailsEmailedTo(value:String):NewAccountModel = copy(accountDetailsEmailedTo = Some(value))
  def withCreatedDate(value:Date):NewAccountModel = copy(createdDate = Some(value))
  def withEmailedDate(value:Date):NewAccountModel = copy(emailedDate = Some(value))
  def withLimitations(value:String):NewAccountModel = copy(limitations = Some(value))
  def withLicenseKey(value:String):NewAccountModel = copy(licenseKey = Some(value))
  def withPaymentUrl(value:String):NewAccountModel = copy(paymentUrl = Some(value))
}
  
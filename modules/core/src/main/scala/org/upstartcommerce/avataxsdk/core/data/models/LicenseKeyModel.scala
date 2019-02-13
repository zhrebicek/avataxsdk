package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LicenseKeyModel(accountId:Option[Int] = None, privateLicenseKey:Option[String] = None, httpRequestHeader:Option[String] = None) {

  def withAccountId(value:Int):LicenseKeyModel = copy(accountId = Some(value))
  def withPrivateLicenseKey(value:String):LicenseKeyModel = copy(privateLicenseKey = Some(value))
  def withHttpRequestHeader(value:String):LicenseKeyModel = copy(httpRequestHeader = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CurrencyModel(code:Option[String] = None, description:Option[String] = None, decimalDigits:Option[Int] = None) {
  def withCode(value:String):CurrencyModel = copy(code = Some(value))
  def withDescription(value:String):CurrencyModel = copy(description = Some(value))
  def withDecimalDigits(value:Int):CurrencyModel = copy(decimalDigits = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CurrencyModel(code:Option[String] = None, description:Option[String] = None, decimalDigits:Option[Int] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class InvoiceMessageModel(content:Option[String] = None, lineNumbers:Option[List[String]] = None) {
  lazy val lineNumbersRaw:List[String] = lineNumbers.getOrElse(List.empty)
  def withContent(value:String):InvoiceMessageModel = copy(content = Some(value))
  def withLineNumbers(value:List[String]):InvoiceMessageModel = copy(lineNumbers = Some(value))
}
  
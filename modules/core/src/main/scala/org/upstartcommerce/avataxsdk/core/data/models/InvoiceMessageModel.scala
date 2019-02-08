package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class InvoiceMessageModel(content:Option[String] = None, lineNumbers:Option[List[String]] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxSubTypeModel(id:Option[Int] = None, taxSubType:Option[String] = None, description:Option[String] = None, taxTypeGroup:Option[String] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemClassificationOutputModel(id:Option[Long] = None, itemId:Option[Long] = None, systemId:Option[Int] = None, productCode:Option[String] = None, systemCode:Option[String] = None)
  
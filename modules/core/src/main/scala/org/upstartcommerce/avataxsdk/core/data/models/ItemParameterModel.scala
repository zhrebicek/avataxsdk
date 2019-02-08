package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemParameterModel(id:Option[Long] = None, name:Option[String] = None, value:Option[String] = None, unit:Option[String] = None, itemId:Option[Long] = None)
  
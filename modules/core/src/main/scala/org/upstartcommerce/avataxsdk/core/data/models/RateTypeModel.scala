package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class RateTypeModel(id:Option[String] = None, description:Option[String] = None, country:Option[String] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CycleExpireModel(success:Option[Boolean] = None, message:Option[String] = None, cycleExpirationOptions:Option[List[CycleExpireOptionModel]] = None)
  
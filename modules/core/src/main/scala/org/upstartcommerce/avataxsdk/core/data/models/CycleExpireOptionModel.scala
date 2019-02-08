package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CycleExpireOptionModel(transactionalPeriodStart:Option[Date] = None, transactionalPeriodEnd:Option[Date] = None, filingDueDate:Option[Date] = None, cycleName:Option[String] = None)
  
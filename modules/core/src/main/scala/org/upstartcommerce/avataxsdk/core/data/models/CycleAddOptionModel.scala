package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CycleAddOptionModel(available:Option[Boolean] = None, transactionalPeriodStart:Option[Date] = None, transactionalPeriodEnd:Option[Date] = None, filingDueDate:Option[Date] = None, cycleName:Option[String] = None, frequencyName:Option[String] = None, filingFrequencyCode:Option[String] = None, filingFrequencyId:Option[FilingFrequencyId] = None, cycleUnavailableReason:Option[String] = None, availableLocationCodes:Option[List[String]] = None)
  
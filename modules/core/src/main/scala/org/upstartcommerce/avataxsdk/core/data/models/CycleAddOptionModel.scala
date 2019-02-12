package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CycleAddOptionModel(available:Option[Boolean] = None, transactionalPeriodStart:Option[Date] = None, transactionalPeriodEnd:Option[Date] = None, filingDueDate:Option[Date] = None, cycleName:Option[String] = None, frequencyName:Option[String] = None, filingFrequencyCode:Option[String] = None, filingFrequencyId:Option[FilingFrequencyId] = None, cycleUnavailableReason:Option[String] = None, availableLocationCodes:List[String] = List.empty) {
  def withAvailable(value:Boolean):CycleAddOptionModel = copy(available = Some(value))
  def withTransactionalPeriodStart(value:Date):CycleAddOptionModel = copy(transactionalPeriodStart = Some(value))
  def withTransactionalPeriodEnd(value:Date):CycleAddOptionModel = copy(transactionalPeriodEnd = Some(value))
  def withFilingDueDate(value:Date):CycleAddOptionModel = copy(filingDueDate = Some(value))
  def withCycleName(value:String):CycleAddOptionModel = copy(cycleName = Some(value))
  def withFrequencyName(value:String):CycleAddOptionModel = copy(frequencyName = Some(value))
  def withFilingFrequencyCode(value:String):CycleAddOptionModel = copy(filingFrequencyCode = Some(value))
  def withFilingFrequencyId(value:FilingFrequencyId):CycleAddOptionModel = copy(filingFrequencyId = Some(value))
  def withCycleUnavailableReason(value:String):CycleAddOptionModel = copy(cycleUnavailableReason = Some(value))
  def withAvailableLocationCodes(value:List[String]):CycleAddOptionModel = copy(availableLocationCodes = value)
}
  
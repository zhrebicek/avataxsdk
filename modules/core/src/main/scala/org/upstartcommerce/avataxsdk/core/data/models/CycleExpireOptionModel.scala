package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CycleExpireOptionModel(transactionalPeriodStart:Option[Date] = None, transactionalPeriodEnd:Option[Date] = None, filingDueDate:Option[Date] = None, cycleName:Option[String] = None) {
  def withTransactionalPeriodStart(value:Date):CycleExpireOptionModel = copy(transactionalPeriodStart = Some(value))
  def withTransactionalPeriodEnd(value:Date):CycleExpireOptionModel = copy(transactionalPeriodEnd = Some(value))
  def withFilingDueDate(value:Date):CycleExpireOptionModel = copy(filingDueDate = Some(value))
  def withCycleName(value:String):CycleExpireOptionModel = copy(cycleName = Some(value))
}
  
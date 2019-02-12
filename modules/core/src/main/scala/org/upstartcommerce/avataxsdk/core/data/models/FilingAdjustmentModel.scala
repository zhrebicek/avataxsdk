package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAdjustmentModel(id:Option[Long] = None, filingId:Option[Long] = None, amount:Option[BigDecimal] = None, period:Option[AdjustmentPeriodTypeId] = None, `type`:Option[String] = None, isCalculated:Option[Boolean] = None, accountType:Option[PaymentAccountTypeId] = None, reason:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {
  def withId(value:Long):FilingAdjustmentModel = copy(id = Some(value))
  def withFilingId(value:Long):FilingAdjustmentModel = copy(filingId = Some(value))
  def withAmount(value:BigDecimal):FilingAdjustmentModel = copy(amount = Some(value))
  def withPeriod(value:AdjustmentPeriodTypeId):FilingAdjustmentModel = copy(period = Some(value))
  def withType(value:String):FilingAdjustmentModel = copy(`type` = Some(value))
  def withIsCalculated(value:Boolean):FilingAdjustmentModel = copy(isCalculated = Some(value))
  def withAccountType(value:PaymentAccountTypeId):FilingAdjustmentModel = copy(accountType = Some(value))
  def withReason(value:String):FilingAdjustmentModel = copy(reason = Some(value))
  def withCreatedDate(value:Date):FilingAdjustmentModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):FilingAdjustmentModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):FilingAdjustmentModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):FilingAdjustmentModel = copy(modifiedUserId = Some(value))
}
  
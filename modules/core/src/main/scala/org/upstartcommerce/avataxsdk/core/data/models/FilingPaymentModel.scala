package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingPaymentModel(id:Option[Long] = None, filingId:Option[Long] = None, paymentAmount:Option[BigDecimal] = None, `type`:Option[PaymentType] = None, isCalculated:Option[Boolean] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {
  def withId(value:Long):FilingPaymentModel = copy(id = Some(value))
  def withFilingId(value:Long):FilingPaymentModel = copy(filingId = Some(value))
  def withPaymentAmount(value:BigDecimal):FilingPaymentModel = copy(paymentAmount = Some(value))
  def withType(value:PaymentType):FilingPaymentModel = copy(`type` = Some(value))
  def withIsCalculated(value:Boolean):FilingPaymentModel = copy(isCalculated = Some(value))
  def withCreatedDate(value:Date):FilingPaymentModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):FilingPaymentModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):FilingPaymentModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):FilingPaymentModel = copy(modifiedUserId = Some(value))
}
  
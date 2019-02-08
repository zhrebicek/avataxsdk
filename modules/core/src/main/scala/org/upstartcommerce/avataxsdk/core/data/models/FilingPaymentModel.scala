package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingPaymentModel(id:Option[Long] = None, filingId:Option[Long] = None, paymentAmount:Option[BigDecimal] = None, `type`:Option[PaymentType] = None, isCalculated:Option[Boolean] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
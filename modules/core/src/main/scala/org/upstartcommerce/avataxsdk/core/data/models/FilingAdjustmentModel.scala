package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAdjustmentModel(id:Option[Long] = None, filingId:Option[Long] = None, amount:Option[BigDecimal] = None, period:Option[AdjustmentPeriodTypeId] = None, `type`:Option[String] = None, isCalculated:Option[Boolean] = None, accountType:Option[PaymentAccountTypeId] = None, reason:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
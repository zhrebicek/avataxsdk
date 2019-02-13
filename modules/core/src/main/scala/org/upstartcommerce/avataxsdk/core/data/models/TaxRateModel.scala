package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxRateModel(totalRate:Option[BigDecimal] = None, rates:Option[List[RateModel]] = None) {
  lazy val ratesRaw:List[RateModel] = rates.getOrElse(List.empty)
  def withTotalRate(value:BigDecimal):TaxRateModel = copy(totalRate = Some(value))
  def withRates(value:List[RateModel]):TaxRateModel = copy(rates = Some(value))
}
  
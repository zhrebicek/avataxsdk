package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxRateModel(totalRate:Option[BigDecimal] = None, rates:List[RateModel] = List.empty) {
  def withTotalRate(value:BigDecimal):TaxRateModel = copy(totalRate = Some(value))
  def withRates(value:List[RateModel]):TaxRateModel = copy(rates = value)
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CoordinateInfo(latitude:Option[BigDecimal] = None, longitude:Option[BigDecimal] = None) {
  def withLatitude(value:BigDecimal):CoordinateInfo = copy(latitude = Some(value))
  def withLongitude(value:BigDecimal):CoordinateInfo = copy(longitude = Some(value))
}
  
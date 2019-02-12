package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LinkCustomersModel(customers:List[String] = List.empty) {
  def withCustomers(value:List[String]):LinkCustomersModel = copy(customers = value)
}
  
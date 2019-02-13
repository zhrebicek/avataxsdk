package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LinkCustomersModel(customers:Option[List[String]] = None) {
  lazy val customersRaw:List[String] = customers.getOrElse(List.empty)
  def withCustomers(value:List[String]):LinkCustomersModel = copy(customers = Some(value))
}
  
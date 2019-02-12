package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxCodeTypesModel(types:Map[String, String] = Map.empty) {
  def withTypes(value:Map[String, String]):TaxCodeTypesModel = copy(types = value)
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxCodeTypesModel(types:Option[Map[String, String]] = None) {
  lazy val typesRaw:Map[String, String] = types.getOrElse(Map.empty)
  def withTypes(value:Map[String, String]):TaxCodeTypesModel = copy(types = Some(value))
}
  
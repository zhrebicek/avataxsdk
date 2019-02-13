package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class RateTypeModel(id:Option[String] = None, description:Option[String] = None, country:Option[String] = None) {

  def withId(value:String):RateTypeModel = copy(id = Some(value))
  def withDescription(value:String):RateTypeModel = copy(description = Some(value))
  def withCountry(value:String):RateTypeModel = copy(country = Some(value))
}
  
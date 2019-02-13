package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class EntityUseCodeModel(code:Option[String] = None, name:Option[String] = None, description:Option[String] = None, validCountries:Option[List[String]] = None) {
  lazy val validCountriesRaw:List[String] = validCountries.getOrElse(List.empty)
  def withCode(value:String):EntityUseCodeModel = copy(code = Some(value))
  def withName(value:String):EntityUseCodeModel = copy(name = Some(value))
  def withDescription(value:String):EntityUseCodeModel = copy(description = Some(value))
  def withValidCountries(value:List[String]):EntityUseCodeModel = copy(validCountries = Some(value))
}
  
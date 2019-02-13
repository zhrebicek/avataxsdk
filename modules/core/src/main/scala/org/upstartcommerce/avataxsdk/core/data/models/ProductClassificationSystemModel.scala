package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ProductClassificationSystemModel(systemId:Option[Int] = None, systemCode:Option[String] = None, description:Option[String] = None, customsValue:Option[String] = None, countries:Option[List[ProductSystemCountryModel]] = None) {
  lazy val countriesRaw:List[ProductSystemCountryModel] = countries.getOrElse(List.empty)
  def withSystemId(value:Int):ProductClassificationSystemModel = copy(systemId = Some(value))
  def withSystemCode(value:String):ProductClassificationSystemModel = copy(systemCode = Some(value))
  def withDescription(value:String):ProductClassificationSystemModel = copy(description = Some(value))
  def withCustomsValue(value:String):ProductClassificationSystemModel = copy(customsValue = Some(value))
  def withCountries(value:List[ProductSystemCountryModel]):ProductClassificationSystemModel = copy(countries = Some(value))
}
  
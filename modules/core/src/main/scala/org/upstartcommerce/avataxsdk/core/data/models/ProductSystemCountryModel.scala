package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ProductSystemCountryModel(systemCountryId:Option[Int] = None, systemId:Option[Int] = None, country:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None) {
  def withSystemCountryId(value:Int):ProductSystemCountryModel = copy(systemCountryId = Some(value))
  def withSystemId(value:Int):ProductSystemCountryModel = copy(systemId = Some(value))
  def withCountry(value:String):ProductSystemCountryModel = copy(country = Some(value))
  def withEffDate(value:Date):ProductSystemCountryModel = copy(effDate = Some(value))
  def withEndDate(value:Date):ProductSystemCountryModel = copy(endDate = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class IsoRegionModel(countryCode:Option[String] = None, code:Option[String] = None, name:Option[String] = None, classification:Option[String] = None, streamlinedSalesTax:Option[Boolean] = None, localizedNames:List[IsoLocalizedName] = List.empty) {
  def withCountryCode(value:String):IsoRegionModel = copy(countryCode = Some(value))
  def withCode(value:String):IsoRegionModel = copy(code = Some(value))
  def withName(value:String):IsoRegionModel = copy(name = Some(value))
  def withClassification(value:String):IsoRegionModel = copy(classification = Some(value))
  def withStreamlinedSalesTax(value:Boolean):IsoRegionModel = copy(streamlinedSalesTax = Some(value))
  def withLocalizedNames(value:List[IsoLocalizedName]):IsoRegionModel = copy(localizedNames = value)
}
  
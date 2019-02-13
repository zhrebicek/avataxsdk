package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingsCheckupSuggestedFormModel(taxAuthorityId:Option[Int] = None, country:Option[String] = None, region:Option[String] = None, returnName:Option[String] = None, taxFormCode:Option[String] = None) {

  def withTaxAuthorityId(value:Int):FilingsCheckupSuggestedFormModel = copy(taxAuthorityId = Some(value))
  def withCountry(value:String):FilingsCheckupSuggestedFormModel = copy(country = Some(value))
  def withRegion(value:String):FilingsCheckupSuggestedFormModel = copy(region = Some(value))
  def withReturnName(value:String):FilingsCheckupSuggestedFormModel = copy(returnName = Some(value))
  def withTaxFormCode(value:String):FilingsCheckupSuggestedFormModel = copy(taxFormCode = Some(value))
}
  
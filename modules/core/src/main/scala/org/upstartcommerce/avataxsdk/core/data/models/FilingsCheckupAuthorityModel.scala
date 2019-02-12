package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingsCheckupAuthorityModel(taxAuthorityId:Option[Int] = None, locationCode:Option[String] = None, taxAuthorityName:Option[String] = None, taxAuthorityTypeId:Option[Int] = None, jurisdictionId:Option[Int] = None, tax:Option[BigDecimal] = None, taxTypeId:Option[String] = None, suggestedForms:List[FilingsCheckupSuggestedFormModel] = List.empty) {
  def withTaxAuthorityId(value:Int):FilingsCheckupAuthorityModel = copy(taxAuthorityId = Some(value))
  def withLocationCode(value:String):FilingsCheckupAuthorityModel = copy(locationCode = Some(value))
  def withTaxAuthorityName(value:String):FilingsCheckupAuthorityModel = copy(taxAuthorityName = Some(value))
  def withTaxAuthorityTypeId(value:Int):FilingsCheckupAuthorityModel = copy(taxAuthorityTypeId = Some(value))
  def withJurisdictionId(value:Int):FilingsCheckupAuthorityModel = copy(jurisdictionId = Some(value))
  def withTax(value:BigDecimal):FilingsCheckupAuthorityModel = copy(tax = Some(value))
  def withTaxTypeId(value:String):FilingsCheckupAuthorityModel = copy(taxTypeId = Some(value))
  def withSuggestedForms(value:List[FilingsCheckupSuggestedFormModel]):FilingsCheckupAuthorityModel = copy(suggestedForms = value)
}
  
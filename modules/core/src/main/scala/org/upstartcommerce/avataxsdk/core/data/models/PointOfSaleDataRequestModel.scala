package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PointOfSaleDataRequestModel(companyCode:Option[String] = None, documentDate:Option[Date] = None, responseType:Option[PointOfSaleFileType] = None, taxCodes:List[String] = List.empty, itemCodes:List[String] = List.empty, locationCodes:List[String] = List.empty, includeJurisCodes:Option[Boolean] = None, partnerId:Option[PointOfSalePartnerId] = None) {
  def withCompanyCode(value:String):PointOfSaleDataRequestModel = copy(companyCode = Some(value))
  def withDocumentDate(value:Date):PointOfSaleDataRequestModel = copy(documentDate = Some(value))
  def withResponseType(value:PointOfSaleFileType):PointOfSaleDataRequestModel = copy(responseType = Some(value))
  def withTaxCodes(value:List[String]):PointOfSaleDataRequestModel = copy(taxCodes = value)
  def withItemCodes(value:List[String]):PointOfSaleDataRequestModel = copy(itemCodes = value)
  def withLocationCodes(value:List[String]):PointOfSaleDataRequestModel = copy(locationCodes = value)
  def withIncludeJurisCodes(value:Boolean):PointOfSaleDataRequestModel = copy(includeJurisCodes = Some(value))
  def withPartnerId(value:PointOfSalePartnerId):PointOfSaleDataRequestModel = copy(partnerId = Some(value))
}
  
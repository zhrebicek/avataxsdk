package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PointOfSaleDataRequestModel(companyCode:Option[String] = None, documentDate:Option[Date] = None, responseType:Option[PointOfSaleFileType] = None, taxCodes:Option[List[String]] = None, itemCodes:Option[List[String]] = None, locationCodes:Option[List[String]] = None, includeJurisCodes:Option[Boolean] = None, partnerId:Option[PointOfSalePartnerId] = None) {
  lazy val taxCodesRaw:List[String] = taxCodes.getOrElse(List.empty)
  lazy val itemCodesRaw:List[String] = itemCodes.getOrElse(List.empty)
  lazy val locationCodesRaw:List[String] = locationCodes.getOrElse(List.empty)
  def withCompanyCode(value:String):PointOfSaleDataRequestModel = copy(companyCode = Some(value))
  def withDocumentDate(value:Date):PointOfSaleDataRequestModel = copy(documentDate = Some(value))
  def withResponseType(value:PointOfSaleFileType):PointOfSaleDataRequestModel = copy(responseType = Some(value))
  def withTaxCodes(value:List[String]):PointOfSaleDataRequestModel = copy(taxCodes = Some(value))
  def withItemCodes(value:List[String]):PointOfSaleDataRequestModel = copy(itemCodes = Some(value))
  def withLocationCodes(value:List[String]):PointOfSaleDataRequestModel = copy(locationCodes = Some(value))
  def withIncludeJurisCodes(value:Boolean):PointOfSaleDataRequestModel = copy(includeJurisCodes = Some(value))
  def withPartnerId(value:PointOfSalePartnerId):PointOfSaleDataRequestModel = copy(partnerId = Some(value))
}
  
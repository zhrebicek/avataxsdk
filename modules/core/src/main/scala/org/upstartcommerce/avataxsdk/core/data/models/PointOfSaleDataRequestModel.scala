package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PointOfSaleDataRequestModel(companyCode:Option[String] = None, documentDate:Option[Date] = None, responseType:Option[PointOfSaleFileType] = None, taxCodes:Option[List[String]] = None, itemCodes:Option[List[String]] = None, locationCodes:Option[List[String]] = None, includeJurisCodes:Option[Boolean] = None, partnerId:Option[PointOfSalePartnerId] = None)
  
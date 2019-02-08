package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxRegionModel(id:Option[Int] = None, code:Option[String] = None, name:Option[String] = None, county:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, serCode:Option[String] = None, signatureCode:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, isAcm:Option[Boolean] = None, isSst:Option[Boolean] = None)
  
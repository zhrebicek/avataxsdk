package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class EcmsDetailModel(exemptCertDetailId:Option[Int] = None, exemptCertId:Option[Int] = None, stateFips:Option[String] = None, region:Option[String] = None, idNo:Option[String] = None, country:Option[String] = None, endDate:Option[Date] = None, idType:Option[String] = None, isTaxCodeListExclusionList:Option[Int] = None, taxCodes:Option[List[EcmsDetailTaxCodeModel]] = None)
  
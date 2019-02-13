package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class EcmsDetailModel(exemptCertDetailId:Option[Int] = None, exemptCertId:Option[Int] = None, stateFips:Option[String] = None, region:Option[String] = None, idNo:Option[String] = None, country:Option[String] = None, endDate:Option[Date] = None, idType:Option[String] = None, isTaxCodeListExclusionList:Option[Int] = None, taxCodes:Option[List[EcmsDetailTaxCodeModel]] = None) {
  lazy val taxCodesRaw:List[EcmsDetailTaxCodeModel] = taxCodes.getOrElse(List.empty)
  def withExemptCertDetailId(value:Int):EcmsDetailModel = copy(exemptCertDetailId = Some(value))
  def withExemptCertId(value:Int):EcmsDetailModel = copy(exemptCertId = Some(value))
  def withStateFips(value:String):EcmsDetailModel = copy(stateFips = Some(value))
  def withRegion(value:String):EcmsDetailModel = copy(region = Some(value))
  def withIdNo(value:String):EcmsDetailModel = copy(idNo = Some(value))
  def withCountry(value:String):EcmsDetailModel = copy(country = Some(value))
  def withEndDate(value:Date):EcmsDetailModel = copy(endDate = Some(value))
  def withIdType(value:String):EcmsDetailModel = copy(idType = Some(value))
  def withIsTaxCodeListExclusionList(value:Int):EcmsDetailModel = copy(isTaxCodeListExclusionList = Some(value))
  def withTaxCodes(value:List[EcmsDetailTaxCodeModel]):EcmsDetailModel = copy(taxCodes = Some(value))
}
  
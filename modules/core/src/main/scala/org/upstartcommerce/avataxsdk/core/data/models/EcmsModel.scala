package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class EcmsModel(exemptCertId:Option[Int] = None, companyId:Option[Int] = None, customerCode:Option[String] = None, customerName:Option[String] = None, address1:Option[String] = None, address2:Option[String] = None, address3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, postalCode:Option[String] = None, country:Option[String] = None, exemptCertTypeId:Option[ExemptCertTypeId] = None, documentRefNo:Option[String] = None, businessTypeId:Option[Int] = None, businessTypeOtherDescription:Option[String] = None, exemptReasonId:Option[String] = None, exemptReasonOtherDescription:Option[String] = None, effectiveDate:Option[Date] = None, regionsApplicable:Option[String] = None, exemptCertStatusId:Option[ExemptCertStatusId] = None, createdDate:Option[Date] = None, lastTransactionDate:Option[Date] = None, expiryDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, countryIssued:Option[String] = None, avaCertId:Option[String] = None, exemptCertReviewStatusId:Option[ExemptCertReviewStatusId] = None, details:Option[List[EcmsDetailModel]] = None) {
  lazy val detailsRaw:List[EcmsDetailModel] = details.getOrElse(List.empty)
  def withExemptCertId(value:Int):EcmsModel = copy(exemptCertId = Some(value))
  def withCompanyId(value:Int):EcmsModel = copy(companyId = Some(value))
  def withCustomerCode(value:String):EcmsModel = copy(customerCode = Some(value))
  def withCustomerName(value:String):EcmsModel = copy(customerName = Some(value))
  def withAddress1(value:String):EcmsModel = copy(address1 = Some(value))
  def withAddress2(value:String):EcmsModel = copy(address2 = Some(value))
  def withAddress3(value:String):EcmsModel = copy(address3 = Some(value))
  def withCity(value:String):EcmsModel = copy(city = Some(value))
  def withRegion(value:String):EcmsModel = copy(region = Some(value))
  def withPostalCode(value:String):EcmsModel = copy(postalCode = Some(value))
  def withCountry(value:String):EcmsModel = copy(country = Some(value))
  def withExemptCertTypeId(value:ExemptCertTypeId):EcmsModel = copy(exemptCertTypeId = Some(value))
  def withDocumentRefNo(value:String):EcmsModel = copy(documentRefNo = Some(value))
  def withBusinessTypeId(value:Int):EcmsModel = copy(businessTypeId = Some(value))
  def withBusinessTypeOtherDescription(value:String):EcmsModel = copy(businessTypeOtherDescription = Some(value))
  def withExemptReasonId(value:String):EcmsModel = copy(exemptReasonId = Some(value))
  def withExemptReasonOtherDescription(value:String):EcmsModel = copy(exemptReasonOtherDescription = Some(value))
  def withEffectiveDate(value:Date):EcmsModel = copy(effectiveDate = Some(value))
  def withRegionsApplicable(value:String):EcmsModel = copy(regionsApplicable = Some(value))
  def withExemptCertStatusId(value:ExemptCertStatusId):EcmsModel = copy(exemptCertStatusId = Some(value))
  def withCreatedDate(value:Date):EcmsModel = copy(createdDate = Some(value))
  def withLastTransactionDate(value:Date):EcmsModel = copy(lastTransactionDate = Some(value))
  def withExpiryDate(value:Date):EcmsModel = copy(expiryDate = Some(value))
  def withCreatedUserId(value:Int):EcmsModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):EcmsModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):EcmsModel = copy(modifiedUserId = Some(value))
  def withCountryIssued(value:String):EcmsModel = copy(countryIssued = Some(value))
  def withAvaCertId(value:String):EcmsModel = copy(avaCertId = Some(value))
  def withExemptCertReviewStatusId(value:ExemptCertReviewStatusId):EcmsModel = copy(exemptCertReviewStatusId = Some(value))
  def withDetails(value:List[EcmsDetailModel]):EcmsModel = copy(details = Some(value))
}
  
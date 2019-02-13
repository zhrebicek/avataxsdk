package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CertificateModel(id:Option[Int] = None, companyId:Option[Int] = None, signedDate:Option[Date] = None, expirationDate:Option[Date] = None, filename:Option[String] = None, valid:Option[Boolean] = None, verified:Option[Boolean] = None, exemptPercentage:Option[BigDecimal] = None, isSingleCertificate:Option[Boolean] = None, validatedExemptionReason:Option[ExemptionReasonModel] = None, exemptionReason:Option[ExemptionReasonModel] = None, status:Option[String] = None, createdDate:Option[Date] = None, modifiedDate:Option[Date] = None, pageCount:Option[Int] = None, customers:Option[List[CustomerModel]] = None, poNumbers:Option[List[PoNumberModel]] = None, exposureZone:Option[ExposureZoneModel] = None, attributes:Option[List[CertificateAttributeModel]] = None, pdf:Option[String] = None, pages:Option[List[String]] = None) {
  lazy val customersRaw:List[CustomerModel] = customers.getOrElse(List.empty)
  lazy val poNumbersRaw:List[PoNumberModel] = poNumbers.getOrElse(List.empty)
  lazy val attributesRaw:List[CertificateAttributeModel] = attributes.getOrElse(List.empty)
  lazy val pagesRaw:List[String] = pages.getOrElse(List.empty)
  def withId(value:Int):CertificateModel = copy(id = Some(value))
  def withCompanyId(value:Int):CertificateModel = copy(companyId = Some(value))
  def withSignedDate(value:Date):CertificateModel = copy(signedDate = Some(value))
  def withExpirationDate(value:Date):CertificateModel = copy(expirationDate = Some(value))
  def withFilename(value:String):CertificateModel = copy(filename = Some(value))
  def withValid(value:Boolean):CertificateModel = copy(valid = Some(value))
  def withVerified(value:Boolean):CertificateModel = copy(verified = Some(value))
  def withExemptPercentage(value:BigDecimal):CertificateModel = copy(exemptPercentage = Some(value))
  def withIsSingleCertificate(value:Boolean):CertificateModel = copy(isSingleCertificate = Some(value))
  def withValidatedExemptionReason(value:ExemptionReasonModel):CertificateModel = copy(validatedExemptionReason = Some(value))
  def withExemptionReason(value:ExemptionReasonModel):CertificateModel = copy(exemptionReason = Some(value))
  def withStatus(value:String):CertificateModel = copy(status = Some(value))
  def withCreatedDate(value:Date):CertificateModel = copy(createdDate = Some(value))
  def withModifiedDate(value:Date):CertificateModel = copy(modifiedDate = Some(value))
  def withPageCount(value:Int):CertificateModel = copy(pageCount = Some(value))
  def withCustomers(value:List[CustomerModel]):CertificateModel = copy(customers = Some(value))
  def withPoNumbers(value:List[PoNumberModel]):CertificateModel = copy(poNumbers = Some(value))
  def withExposureZone(value:ExposureZoneModel):CertificateModel = copy(exposureZone = Some(value))
  def withAttributes(value:List[CertificateAttributeModel]):CertificateModel = copy(attributes = Some(value))
  def withPdf(value:String):CertificateModel = copy(pdf = Some(value))
  def withPages(value:List[String]):CertificateModel = copy(pages = Some(value))
}
  
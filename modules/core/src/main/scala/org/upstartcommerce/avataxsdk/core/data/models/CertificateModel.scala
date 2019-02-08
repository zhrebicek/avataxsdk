package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CertificateModel(id:Option[Int] = None, companyId:Option[Int] = None, signedDate:Option[Date] = None, expirationDate:Option[Date] = None, filename:Option[String] = None, valid:Option[Boolean] = None, verified:Option[Boolean] = None, exemptPercentage:Option[BigDecimal] = None, isSingleCertificate:Option[Boolean] = None, validatedExemptionReason:Option[ExemptionReasonModel] = None, exemptionReason:Option[ExemptionReasonModel] = None, status:Option[String] = None, createdDate:Option[Date] = None, modifiedDate:Option[Date] = None, pageCount:Option[Int] = None, customers:Option[List[CustomerModel]] = None, poNumbers:Option[List[PoNumberModel]] = None, exposureZone:Option[ExposureZoneModel] = None, attributes:Option[List[CertificateAttributeModel]] = None, pdf:Option[String] = None, pages:Option[List[String]] = None)
  
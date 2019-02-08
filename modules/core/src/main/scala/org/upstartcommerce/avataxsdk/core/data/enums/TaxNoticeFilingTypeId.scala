package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TaxNoticeFilingTypeId
object TaxNoticeFilingTypeId {
  case object ElectronicReturn extends TaxNoticeFilingTypeId
  case object PaperReturn extends TaxNoticeFilingTypeId
  case object ReturnNotFiled extends TaxNoticeFilingTypeId
  case object EFTPaper extends TaxNoticeFilingTypeId
  case object SER extends TaxNoticeFilingTypeId
  case object TrustfileEdi extends TaxNoticeFilingTypeId
  case object UploadFile extends TaxNoticeFilingTypeId
  case object PaperManual extends TaxNoticeFilingTypeId
  case object CertCapture extends TaxNoticeFilingTypeId
  case object SignatureReady extends TaxNoticeFilingTypeId
}
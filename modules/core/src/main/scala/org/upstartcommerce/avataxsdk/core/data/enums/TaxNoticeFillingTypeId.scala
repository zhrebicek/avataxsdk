package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TaxNoticeFillingTypeId
object TaxNoticeFillingTypeId {
  case object ElectronicReturn extends TaxNoticeFillingTypeId
  case object PaperReturn extends TaxNoticeFillingTypeId
  case object ReturnNotFiled extends TaxNoticeFillingTypeId
  case object EFTPaper extends TaxNoticeFillingTypeId
  case object SER extends TaxNoticeFillingTypeId
  case object TrustfileEdi extends TaxNoticeFillingTypeId
  case object UploadFile extends TaxNoticeFillingTypeId
  case object PaperManual extends TaxNoticeFillingTypeId
  case object CertCapture extends TaxNoticeFillingTypeId
  case object SignatureReady extends TaxNoticeFillingTypeId
}
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AuditTransactionModel(companyId:Option[Int] = None, reconstructed:Option[ReconstructedApiRequestResponseModel] = None, serverTimestamp:Option[Date] = None, serverDuration:Option[Date] = None, apiCallStatus:Option[ApiCallStatus] = None, original:Option[OriginalApiRequestResponseModel] = None) {

  def withCompanyId(value:Int):AuditTransactionModel = copy(companyId = Some(value))
  def withReconstructed(value:ReconstructedApiRequestResponseModel):AuditTransactionModel = copy(reconstructed = Some(value))
  def withServerTimestamp(value:Date):AuditTransactionModel = copy(serverTimestamp = Some(value))
  def withServerDuration(value:Date):AuditTransactionModel = copy(serverDuration = Some(value))
  def withApiCallStatus(value:ApiCallStatus):AuditTransactionModel = copy(apiCallStatus = Some(value))
  def withOriginal(value:OriginalApiRequestResponseModel):AuditTransactionModel = copy(original = Some(value))
}
  
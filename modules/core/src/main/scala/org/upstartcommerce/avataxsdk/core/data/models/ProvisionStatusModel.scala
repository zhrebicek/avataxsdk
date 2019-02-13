package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ProvisionStatusModel(status:Option[CertCaptureProvisionStatus] = None, accountId:Option[Int] = None, companyId:Option[Int] = None) {

  def withStatus(value:CertCaptureProvisionStatus):ProvisionStatusModel = copy(status = Some(value))
  def withAccountId(value:Int):ProvisionStatusModel = copy(accountId = Some(value))
  def withCompanyId(value:Int):ProvisionStatusModel = copy(companyId = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingRequestModel(id:Option[Long] = None, companyId:Option[Int] = None, filingRequestStatusId:Option[FilingRequestStatus] = None, data:Option[FilingRequestDataModel] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {

  def withId(value:Long):FilingRequestModel = copy(id = Some(value))
  def withCompanyId(value:Int):FilingRequestModel = copy(companyId = Some(value))
  def withFilingRequestStatusId(value:FilingRequestStatus):FilingRequestModel = copy(filingRequestStatusId = Some(value))
  def withData(value:FilingRequestDataModel):FilingRequestModel = copy(data = Some(value))
  def withCreatedDate(value:Date):FilingRequestModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):FilingRequestModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):FilingRequestModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):FilingRequestModel = copy(modifiedUserId = Some(value))
}
  
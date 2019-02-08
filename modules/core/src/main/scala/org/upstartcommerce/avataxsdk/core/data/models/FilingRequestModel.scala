package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingRequestModel(id:Option[Long] = None, companyId:Option[Int] = None, filingRequestStatusId:Option[FilingRequestStatus] = None, data:Option[FilingRequestDataModel] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
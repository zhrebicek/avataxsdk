package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingStatusChangeModel(requestedStatus:Option[CompanyFilingStatus] = None) {

  def withRequestedStatus(value:CompanyFilingStatus):FilingStatusChangeModel = copy(requestedStatus = Some(value))
}
  
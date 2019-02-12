package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ReconstructedApiRequestResponseModel(request:Option[CreateTransactionModel] = None) {
  def withRequest(value:CreateTransactionModel):ReconstructedApiRequestResponseModel = copy(request = Some(value))
}
  
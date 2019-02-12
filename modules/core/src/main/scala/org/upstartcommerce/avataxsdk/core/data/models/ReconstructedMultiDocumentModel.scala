package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ReconstructedMultiDocumentModel(request:Option[CreateMultiDocumentModel] = None) {
  def withRequest(value:CreateMultiDocumentModel):ReconstructedMultiDocumentModel = copy(request = Some(value))
}
  
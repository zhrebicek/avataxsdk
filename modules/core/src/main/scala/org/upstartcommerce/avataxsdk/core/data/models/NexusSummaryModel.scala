package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusSummaryModel(companyId:Option[Int] = None, nexusSummary:List[NexusTaxTypeGroupCountModel] = List.empty) {
  def withCompanyId(value:Int):NexusSummaryModel = copy(companyId = Some(value))
  def withNexusSummary(value:List[NexusTaxTypeGroupCountModel]):NexusSummaryModel = copy(nexusSummary = value)
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusSummaryModel(companyId:Option[Int] = None, nexusSummary:Option[List[NexusTaxTypeGroupCountModel]] = None) {
  lazy val nexusSummaryRaw:List[NexusTaxTypeGroupCountModel] = nexusSummary.getOrElse(List.empty)
  def withCompanyId(value:Int):NexusSummaryModel = copy(companyId = Some(value))
  def withNexusSummary(value:List[NexusTaxTypeGroupCountModel]):NexusSummaryModel = copy(nexusSummary = Some(value))
}
  
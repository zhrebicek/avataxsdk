package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusByTaxFormModel(formCode:Option[String] = None, companyId:Option[Int] = None, nexusDefinitions:List[NexusModel] = List.empty, companyNexus:List[NexusModel] = List.empty) {
  def withFormCode(value:String):NexusByTaxFormModel = copy(formCode = Some(value))
  def withCompanyId(value:Int):NexusByTaxFormModel = copy(companyId = Some(value))
  def withNexusDefinitions(value:List[NexusModel]):NexusByTaxFormModel = copy(nexusDefinitions = value)
  def withCompanyNexus(value:List[NexusModel]):NexusByTaxFormModel = copy(companyNexus = value)
}
  
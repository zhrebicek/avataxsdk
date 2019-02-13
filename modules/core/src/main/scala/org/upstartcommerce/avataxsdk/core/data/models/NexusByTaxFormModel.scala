package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusByTaxFormModel(formCode:Option[String] = None, companyId:Option[Int] = None, nexusDefinitions:Option[List[NexusModel]] = None, companyNexus:Option[List[NexusModel]] = None) {
  lazy val nexusDefinitionsRaw:List[NexusModel] = nexusDefinitions.getOrElse(List.empty)
  lazy val companyNexusRaw:List[NexusModel] = companyNexus.getOrElse(List.empty)
  def withFormCode(value:String):NexusByTaxFormModel = copy(formCode = Some(value))
  def withCompanyId(value:Int):NexusByTaxFormModel = copy(companyId = Some(value))
  def withNexusDefinitions(value:List[NexusModel]):NexusByTaxFormModel = copy(nexusDefinitions = Some(value))
  def withCompanyNexus(value:List[NexusModel]):NexusByTaxFormModel = copy(companyNexus = Some(value))
}
  
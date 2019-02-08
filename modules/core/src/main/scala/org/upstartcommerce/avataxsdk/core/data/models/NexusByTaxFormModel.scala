package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusByTaxFormModel(formCode:Option[String] = None, companyId:Option[Int] = None, nexusDefinitions:Option[List[NexusModel]] = None, companyNexus:Option[List[NexusModel]] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusByAddressModel(address:Option[DeclareNexusByAddressModel] = None, declaredNexus:Option[List[NexusModel]] = None)
  
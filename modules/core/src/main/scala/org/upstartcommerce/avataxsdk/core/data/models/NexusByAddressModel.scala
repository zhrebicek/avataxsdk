package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusByAddressModel(address:Option[DeclareNexusByAddressModel] = None, declaredNexus:List[NexusModel] = List.empty) {
  def withAddress(value:DeclareNexusByAddressModel):NexusByAddressModel = copy(address = Some(value))
  def withDeclaredNexus(value:List[NexusModel]):NexusByAddressModel = copy(declaredNexus = value)
}
  
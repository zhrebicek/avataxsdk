package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemSyncModel(itemCode:Option[String] = None, description:Option[String] = None, itemGroup:Option[String] = None, taxCode:Option[String] = None) {

  def withItemCode(value:String):ItemSyncModel = copy(itemCode = Some(value))
  def withDescription(value:String):ItemSyncModel = copy(description = Some(value))
  def withItemGroup(value:String):ItemSyncModel = copy(itemGroup = Some(value))
  def withTaxCode(value:String):ItemSyncModel = copy(taxCode = Some(value))
}
  
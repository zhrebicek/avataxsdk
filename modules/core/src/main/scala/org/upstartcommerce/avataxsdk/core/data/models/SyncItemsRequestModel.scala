package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SyncItemsRequestModel(items:List[ItemSyncModel] = List.empty) {
  def withItems(value:List[ItemSyncModel]):SyncItemsRequestModel = copy(items = value)
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SyncItemsRequestModel(items:Option[List[ItemSyncModel]] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemSyncModel(itemCode:Option[String] = None, description:Option[String] = None, itemGroup:Option[String] = None, taxCode:Option[String] = None)
  
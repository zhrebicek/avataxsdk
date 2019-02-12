package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SyncItemsResponseModel(status:Option[String] = None) {
  def withStatus(value:String):SyncItemsResponseModel = copy(status = Some(value))
}
  
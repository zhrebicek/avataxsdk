package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class RebuildFilingsModel(rebuild:Option[Boolean] = None) {
  def withRebuild(value:Boolean):RebuildFilingsModel = copy(rebuild = Some(value))
}
  
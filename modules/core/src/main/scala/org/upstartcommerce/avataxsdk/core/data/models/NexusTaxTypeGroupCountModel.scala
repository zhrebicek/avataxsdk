package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusTaxTypeGroupCountModel(nexusTaxTypeGroup:Option[String] = None, count:Option[Int] = None) {

  def withNexusTaxTypeGroup(value:String):NexusTaxTypeGroupCountModel = copy(nexusTaxTypeGroup = Some(value))
  def withCount(value:Int):NexusTaxTypeGroupCountModel = copy(count = Some(value))
}
  
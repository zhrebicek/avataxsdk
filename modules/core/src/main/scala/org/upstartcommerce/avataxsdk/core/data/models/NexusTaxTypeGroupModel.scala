package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusTaxTypeGroupModel(id:Option[Int] = None, nexusTaxTypeGroupId:Option[String] = None, description:Option[String] = None, subscriptionTypeId:Option[Int] = None, subscriptionDescription:Option[String] = None, tabName:Option[String] = None, showColumn:Option[Boolean] = None) {

  def withId(value:Int):NexusTaxTypeGroupModel = copy(id = Some(value))
  def withNexusTaxTypeGroupId(value:String):NexusTaxTypeGroupModel = copy(nexusTaxTypeGroupId = Some(value))
  def withDescription(value:String):NexusTaxTypeGroupModel = copy(description = Some(value))
  def withSubscriptionTypeId(value:Int):NexusTaxTypeGroupModel = copy(subscriptionTypeId = Some(value))
  def withSubscriptionDescription(value:String):NexusTaxTypeGroupModel = copy(subscriptionDescription = Some(value))
  def withTabName(value:String):NexusTaxTypeGroupModel = copy(tabName = Some(value))
  def withShowColumn(value:Boolean):NexusTaxTypeGroupModel = copy(showColumn = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxTypeGroupModel(id:Option[Int] = None, taxTypeGroup:Option[String] = None, description:Option[String] = None, subscriptionTypeId:Option[Int] = None, subscriptionDescription:Option[String] = None, tabName:Option[String] = None, showColumn:Option[Boolean] = None, displaySequence:Option[Int] = None) {

  def withId(value:Int):TaxTypeGroupModel = copy(id = Some(value))
  def withTaxTypeGroup(value:String):TaxTypeGroupModel = copy(taxTypeGroup = Some(value))
  def withDescription(value:String):TaxTypeGroupModel = copy(description = Some(value))
  def withSubscriptionTypeId(value:Int):TaxTypeGroupModel = copy(subscriptionTypeId = Some(value))
  def withSubscriptionDescription(value:String):TaxTypeGroupModel = copy(subscriptionDescription = Some(value))
  def withTabName(value:String):TaxTypeGroupModel = copy(tabName = Some(value))
  def withShowColumn(value:Boolean):TaxTypeGroupModel = copy(showColumn = Some(value))
  def withDisplaySequence(value:Int):TaxTypeGroupModel = copy(displaySequence = Some(value))
}
  
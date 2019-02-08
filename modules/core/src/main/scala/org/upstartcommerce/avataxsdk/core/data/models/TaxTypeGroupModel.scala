package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxTypeGroupModel(id:Option[Int] = None, taxTypeGroup:Option[String] = None, description:Option[String] = None, subscriptionTypeId:Option[Int] = None, subscriptionDescription:Option[String] = None, tabName:Option[String] = None, showColumn:Option[Boolean] = None, displaySequence:Option[Int] = None)
  
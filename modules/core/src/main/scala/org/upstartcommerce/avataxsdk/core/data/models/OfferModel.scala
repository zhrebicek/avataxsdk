package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class OfferModel(id:Option[String] = None, offerMessage:Option[String] = None) {

  def withId(value:String):OfferModel = copy(id = Some(value))
  def withOfferMessage(value:String):OfferModel = copy(offerMessage = Some(value))
}
  
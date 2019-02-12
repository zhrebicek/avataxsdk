package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddressesModel(singleLocation:Option[AddressLocationInfo] = None, shipFrom:Option[AddressLocationInfo] = None, shipTo:Option[AddressLocationInfo] = None, pointOfOrderOrigin:Option[AddressLocationInfo] = None, pointOfOrderAcceptance:Option[AddressLocationInfo] = None) {
  def withSingleLocation(value:AddressLocationInfo):AddressesModel = copy(singleLocation = Some(value))
  def withShipFrom(value:AddressLocationInfo):AddressesModel = copy(shipFrom = Some(value))
  def withShipTo(value:AddressLocationInfo):AddressesModel = copy(shipTo = Some(value))
  def withPointOfOrderOrigin(value:AddressLocationInfo):AddressesModel = copy(pointOfOrderOrigin = Some(value))
  def withPointOfOrderAcceptance(value:AddressLocationInfo):AddressesModel = copy(pointOfOrderAcceptance = Some(value))
}
  
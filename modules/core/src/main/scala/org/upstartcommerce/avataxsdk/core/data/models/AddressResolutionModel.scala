package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddressResolutionModel(address:Option[AddressInfo] = None, validatedAddresses:List[ValidatedAddressInfo] = List.empty, coordinates:Option[CoordinateInfo] = None, resolutionQuality:Option[ResolutionQuality] = None, taxAuthorities:List[TaxAuthorityInfo] = List.empty, messages:List[AvaTaxMessage] = List.empty) {
  def withAddress(value:AddressInfo):AddressResolutionModel = copy(address = Some(value))
  def withValidatedAddresses(value:List[ValidatedAddressInfo]):AddressResolutionModel = copy(validatedAddresses = value)
  def withCoordinates(value:CoordinateInfo):AddressResolutionModel = copy(coordinates = Some(value))
  def withResolutionQuality(value:ResolutionQuality):AddressResolutionModel = copy(resolutionQuality = Some(value))
  def withTaxAuthorities(value:List[TaxAuthorityInfo]):AddressResolutionModel = copy(taxAuthorities = value)
  def withMessages(value:List[AvaTaxMessage]):AddressResolutionModel = copy(messages = value)
}
  
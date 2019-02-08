package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddressResolutionModel(address:Option[AddressInfo] = None, validatedAddresses:Option[List[ValidatedAddressInfo]] = None, coordinates:Option[CoordinateInfo] = None, resolutionQuality:Option[ResolutionQuality] = None, taxAuthorities:Option[List[TaxAuthorityInfo]] = None, messages:Option[List[AvaTaxMessage]] = None)
  
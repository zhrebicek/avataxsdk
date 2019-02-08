package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddressesModel(singleLocation:Option[AddressLocationInfo] = None, shipFrom:Option[AddressLocationInfo] = None, shipTo:Option[AddressLocationInfo] = None, pointOfOrderOrigin:Option[AddressLocationInfo] = None, pointOfOrderAcceptance:Option[AddressLocationInfo] = None)
  
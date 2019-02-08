package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class IsoCountryModel(code:Option[String] = None, alpha3Code:Option[String] = None, name:Option[String] = None, isEuropeanUnion:Option[Boolean] = None, localizedNames:Option[List[IsoLocalizedName]] = None, addressesRequireRegion:Option[Boolean] = None)
  
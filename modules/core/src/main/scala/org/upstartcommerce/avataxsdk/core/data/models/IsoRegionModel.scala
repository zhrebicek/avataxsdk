package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class IsoRegionModel(countryCode:Option[String] = None, code:Option[String] = None, name:Option[String] = None, classification:Option[String] = None, streamlinedSalesTax:Option[Boolean] = None, localizedNames:Option[List[IsoLocalizedName]] = None)
  
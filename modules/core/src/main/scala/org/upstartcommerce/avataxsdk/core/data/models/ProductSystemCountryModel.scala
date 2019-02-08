package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ProductSystemCountryModel(systemCountryId:Option[Int] = None, systemId:Option[Int] = None, country:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None)
  
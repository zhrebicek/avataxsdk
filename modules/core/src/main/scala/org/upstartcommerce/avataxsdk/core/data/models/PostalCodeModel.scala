package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PostalCodeModel(country:Option[String] = None, region:Option[String] = None, taxRegionId:Option[Int] = None, effDate:Option[Date] = None, endDate:Option[Date] = None, postalCode:Option[String] = None)
  
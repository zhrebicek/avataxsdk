package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PreferredProgramModel(id:Option[Int] = None, code:Option[String] = None, originCountry:Option[String] = None, destinationCountry:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None)
  
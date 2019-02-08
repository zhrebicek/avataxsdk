package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class HsCodeModel(hsCode:Option[String] = None, id:Option[Long] = None, parentHsCodeId:Option[Long] = None, description:Option[String] = None, system:Option[String] = None, destinationCountry:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None)
  
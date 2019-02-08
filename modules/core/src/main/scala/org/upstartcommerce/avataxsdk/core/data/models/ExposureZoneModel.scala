package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ExposureZoneModel(id:Option[Int] = None, companyId:Option[Int] = None, name:Option[String] = None, tag:Option[String] = None, description:Option[String] = None, created:Option[Date] = None, modified:Option[Date] = None, region:Option[String] = None, country:Option[String] = None)
  
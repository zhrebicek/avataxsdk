package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CompanyDistanceThresholdModel(id:Option[Long] = None, companyId:Option[Int] = None, originCountry:Option[String] = None, destinationCountry:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None, thresholdExceeded:Option[Boolean] = None, `type`:Option[String] = None)
  
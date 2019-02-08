package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ReportParametersModel(startDate:Option[Date] = None, endDate:Option[Date] = None, country:Option[String] = None, state:Option[String] = None, dateFilter:Option[String] = None, docType:Option[String] = None, dateFormat:Option[String] = None, culture:Option[String] = None, currencyCode:Option[String] = None)
  
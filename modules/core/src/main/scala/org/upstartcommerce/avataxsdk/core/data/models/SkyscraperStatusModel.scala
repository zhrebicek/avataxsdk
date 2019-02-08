package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SkyscraperStatusModel(name:Option[String] = None, taxFormCodes:Option[List[String]] = None, country:Option[String] = None, scraperType:Option[ScraperType] = None, isAvailable:Option[Boolean] = None, expectedResponseTime:Option[String] = None, message:Option[String] = None, requiredFilingCalendarDataFields:Option[List[requiredFilingCalendarDataFieldModel]] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SkyscraperStatusModel(name:Option[String] = None, taxFormCodes:List[String] = List.empty, country:Option[String] = None, scraperType:Option[ScraperType] = None, isAvailable:Option[Boolean] = None, expectedResponseTime:Option[String] = None, message:Option[String] = None, requiredFilingCalendarDataFields:List[requiredFilingCalendarDataFieldModel] = List.empty) {
  def withName(value:String):SkyscraperStatusModel = copy(name = Some(value))
  def withTaxFormCodes(value:List[String]):SkyscraperStatusModel = copy(taxFormCodes = value)
  def withCountry(value:String):SkyscraperStatusModel = copy(country = Some(value))
  def withScraperType(value:ScraperType):SkyscraperStatusModel = copy(scraperType = Some(value))
  def withIsAvailable(value:Boolean):SkyscraperStatusModel = copy(isAvailable = Some(value))
  def withExpectedResponseTime(value:String):SkyscraperStatusModel = copy(expectedResponseTime = Some(value))
  def withMessage(value:String):SkyscraperStatusModel = copy(message = Some(value))
  def withRequiredFilingCalendarDataFields(value:List[requiredFilingCalendarDataFieldModel]):SkyscraperStatusModel = copy(requiredFilingCalendarDataFields = value)
}
  
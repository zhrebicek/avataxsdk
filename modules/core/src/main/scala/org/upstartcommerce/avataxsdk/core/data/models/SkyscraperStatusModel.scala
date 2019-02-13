package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SkyscraperStatusModel(name:Option[String] = None, taxFormCodes:Option[List[String]] = None, country:Option[String] = None, scraperType:Option[ScraperType] = None, isAvailable:Option[Boolean] = None, expectedResponseTime:Option[String] = None, message:Option[String] = None, requiredFilingCalendarDataFields:Option[List[requiredFilingCalendarDataFieldModel]] = None) {
  lazy val taxFormCodesRaw:List[String] = taxFormCodes.getOrElse(List.empty)
  lazy val requiredFilingCalendarDataFieldsRaw:List[requiredFilingCalendarDataFieldModel] = requiredFilingCalendarDataFields.getOrElse(List.empty)
  def withName(value:String):SkyscraperStatusModel = copy(name = Some(value))
  def withTaxFormCodes(value:List[String]):SkyscraperStatusModel = copy(taxFormCodes = Some(value))
  def withCountry(value:String):SkyscraperStatusModel = copy(country = Some(value))
  def withScraperType(value:ScraperType):SkyscraperStatusModel = copy(scraperType = Some(value))
  def withIsAvailable(value:Boolean):SkyscraperStatusModel = copy(isAvailable = Some(value))
  def withExpectedResponseTime(value:String):SkyscraperStatusModel = copy(expectedResponseTime = Some(value))
  def withMessage(value:String):SkyscraperStatusModel = copy(message = Some(value))
  def withRequiredFilingCalendarDataFields(value:List[requiredFilingCalendarDataFieldModel]):SkyscraperStatusModel = copy(requiredFilingCalendarDataFields = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ExportDocumentLineModel(format:Option[ReportFormat] = None, startDate:Option[Date] = None, endDate:Option[Date] = None, country:Option[String] = None, state:Option[String] = None, dateFilter:Option[ReportDateFilter] = None, docType:Option[ReportDocType] = None, dateFormat:Option[String] = None, culture:Option[String] = None, currencyCode:Option[String] = None) {

  def withFormat(value:ReportFormat):ExportDocumentLineModel = copy(format = Some(value))
  def withStartDate(value:Date):ExportDocumentLineModel = copy(startDate = Some(value))
  def withEndDate(value:Date):ExportDocumentLineModel = copy(endDate = Some(value))
  def withCountry(value:String):ExportDocumentLineModel = copy(country = Some(value))
  def withState(value:String):ExportDocumentLineModel = copy(state = Some(value))
  def withDateFilter(value:ReportDateFilter):ExportDocumentLineModel = copy(dateFilter = Some(value))
  def withDocType(value:ReportDocType):ExportDocumentLineModel = copy(docType = Some(value))
  def withDateFormat(value:String):ExportDocumentLineModel = copy(dateFormat = Some(value))
  def withCulture(value:String):ExportDocumentLineModel = copy(culture = Some(value))
  def withCurrencyCode(value:String):ExportDocumentLineModel = copy(currencyCode = Some(value))
}
  
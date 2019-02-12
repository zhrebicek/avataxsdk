package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ReportParametersModel(startDate:Option[Date] = None, endDate:Option[Date] = None, country:Option[String] = None, state:Option[String] = None, dateFilter:Option[String] = None, docType:Option[String] = None, dateFormat:Option[String] = None, culture:Option[String] = None, currencyCode:Option[String] = None) {
  def withStartDate(value:Date):ReportParametersModel = copy(startDate = Some(value))
  def withEndDate(value:Date):ReportParametersModel = copy(endDate = Some(value))
  def withCountry(value:String):ReportParametersModel = copy(country = Some(value))
  def withState(value:String):ReportParametersModel = copy(state = Some(value))
  def withDateFilter(value:String):ReportParametersModel = copy(dateFilter = Some(value))
  def withDocType(value:String):ReportParametersModel = copy(docType = Some(value))
  def withDateFormat(value:String):ReportParametersModel = copy(dateFormat = Some(value))
  def withCulture(value:String):ReportParametersModel = copy(culture = Some(value))
  def withCurrencyCode(value:String):ReportParametersModel = copy(currencyCode = Some(value))
}
  
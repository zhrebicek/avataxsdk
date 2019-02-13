package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingRequestDataModel(companyReturnId:Option[Long] = None, returnName:Option[String] = None, taxFormCode:Option[String] = None, filingFrequencyId:Option[FilingFrequencyId] = None, registrationId:Option[String] = None, months:Option[Short] = None, taxTypeId:Option[MatchingTaxType] = None, locationCode:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None, isClone:Option[Boolean] = None, country:Option[String] = None, region:Option[String] = None, taxAuthorityId:Option[Int] = None, taxAuthorityName:Option[String] = None, answers:Option[List[FilingAnswerModel]] = None) {
  lazy val answersRaw:List[FilingAnswerModel] = answers.getOrElse(List.empty)
  def withCompanyReturnId(value:Long):FilingRequestDataModel = copy(companyReturnId = Some(value))
  def withReturnName(value:String):FilingRequestDataModel = copy(returnName = Some(value))
  def withTaxFormCode(value:String):FilingRequestDataModel = copy(taxFormCode = Some(value))
  def withFilingFrequencyId(value:FilingFrequencyId):FilingRequestDataModel = copy(filingFrequencyId = Some(value))
  def withRegistrationId(value:String):FilingRequestDataModel = copy(registrationId = Some(value))
  def withMonths(value:Short):FilingRequestDataModel = copy(months = Some(value))
  def withTaxTypeId(value:MatchingTaxType):FilingRequestDataModel = copy(taxTypeId = Some(value))
  def withLocationCode(value:String):FilingRequestDataModel = copy(locationCode = Some(value))
  def withEffDate(value:Date):FilingRequestDataModel = copy(effDate = Some(value))
  def withEndDate(value:Date):FilingRequestDataModel = copy(endDate = Some(value))
  def withIsClone(value:Boolean):FilingRequestDataModel = copy(isClone = Some(value))
  def withCountry(value:String):FilingRequestDataModel = copy(country = Some(value))
  def withRegion(value:String):FilingRequestDataModel = copy(region = Some(value))
  def withTaxAuthorityId(value:Int):FilingRequestDataModel = copy(taxAuthorityId = Some(value))
  def withTaxAuthorityName(value:String):FilingRequestDataModel = copy(taxAuthorityName = Some(value))
  def withAnswers(value:List[FilingAnswerModel]):FilingRequestDataModel = copy(answers = Some(value))
}
  
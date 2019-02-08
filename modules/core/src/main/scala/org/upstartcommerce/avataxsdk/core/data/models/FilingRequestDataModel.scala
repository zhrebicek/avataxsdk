package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingRequestDataModel(companyReturnId:Option[Long] = None, returnName:Option[String] = None, taxFormCode:Option[String] = None, filingFrequencyId:Option[FilingFrequencyId] = None, registrationId:Option[String] = None, months:Option[Short] = None, taxTypeId:Option[MatchingTaxType] = None, locationCode:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None, isClone:Option[Boolean] = None, country:Option[String] = None, region:Option[String] = None, taxAuthorityId:Option[Int] = None, taxAuthorityName:Option[String] = None, answers:Option[List[FilingAnswerModel]] = None)
  
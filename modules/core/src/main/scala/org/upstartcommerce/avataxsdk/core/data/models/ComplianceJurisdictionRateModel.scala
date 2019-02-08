package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ComplianceJurisdictionRateModel(jurisdictionId:Option[Int] = None, country:Option[String] = None, region:Option[String] = None, name:Option[String] = None, jurisdictionTypeId:Option[String] = None, rate:Option[BigDecimal] = None, rateTypeId:Option[String] = None, taxTypeId:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, stateAssignedCode:Option[String] = None, taxAuthorityId:Option[Int] = None)
  
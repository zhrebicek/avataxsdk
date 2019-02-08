package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ComplianceJurisdictionModel(taxRegionId:Option[Int] = None, stateAssignedCode:Option[String] = None, jurisdictionTypeId:Option[String] = None, name:Option[String] = None, county:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, taxRegionName:Option[String] = None, taxAuthorityId:Option[Int] = None, rates:Option[List[ComplianceAggregatedTaxRateModel]] = None)
  
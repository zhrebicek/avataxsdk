package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxRegionJurisdictionModel(jurisdictionId:Option[Int] = None, taxRegionId:Option[Int] = None, jurisdictionLevelId:Option[Int] = None, rockName:Option[String] = None, reportLevel:Option[Int] = None, stateAssignedCode:Option[String] = None, taxAuthorityId:Option[Int] = None, signatureCode:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None)
  
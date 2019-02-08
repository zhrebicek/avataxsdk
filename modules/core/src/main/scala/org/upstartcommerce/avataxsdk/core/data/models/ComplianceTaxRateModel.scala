package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ComplianceTaxRateModel(id:Option[Int] = None, rate:Option[BigDecimal] = None, jurisdictionId:Option[Int] = None, taxRegionId:Option[Int] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, rateTypeId:Option[String] = None, taxTypeId:Option[String] = None, taxName:Option[String] = None, unitOfBasisId:Option[Long] = None, rateTypeTaxTypeMappingId:Option[Int] = None)
  
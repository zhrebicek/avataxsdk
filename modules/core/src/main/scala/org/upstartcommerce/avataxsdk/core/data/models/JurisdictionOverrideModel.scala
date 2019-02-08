package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class JurisdictionOverrideModel(id:Option[Int] = None, accountId:Option[Int] = None, description:Option[String] = None, line1:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, postalCode:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, jurisdictions:Option[List[JurisdictionModel]] = None, taxRegionId:Option[Int] = None, boundaryLevel:Option[BoundaryLevel] = None, isDefault:Option[Boolean] = None)
  
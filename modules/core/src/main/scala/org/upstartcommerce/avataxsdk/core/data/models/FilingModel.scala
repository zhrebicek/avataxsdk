package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingModel(id:Option[Long] = None, companyId:Option[Int] = None, month:Option[Int] = None, year:Option[Short] = None, `type`:Option[WorksheetTypeId] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, filingRegions:Option[List[FilingRegionModel]] = None)
  
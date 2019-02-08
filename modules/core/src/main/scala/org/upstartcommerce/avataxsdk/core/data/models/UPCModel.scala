package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UPCModel(id:Option[Int] = None, companyId:Option[Int] = None, upc:Option[String] = None, legacyTaxCode:Option[String] = None, description:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, usage:Option[Int] = None, isSystem:Option[Int] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
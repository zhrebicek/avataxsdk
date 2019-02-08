package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxCodeModel(id:Option[Int] = None, companyId:Option[Int] = None, taxCode:Option[String] = None, taxCodeTypeId:Option[String] = None, description:Option[String] = None, parentTaxCode:Option[String] = None, isPhysical:Option[Boolean] = None, goodsServiceCode:Option[Long] = None, entityUseCode:Option[String] = None, isActive:Option[Boolean] = None, isSSTCertified:Option[Boolean] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
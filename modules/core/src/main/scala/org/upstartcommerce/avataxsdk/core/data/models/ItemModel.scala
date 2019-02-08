package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemModel(id:Option[Long] = None, companyId:Option[Int] = None, itemCode:Option[String] = None, taxCodeId:Option[Int] = None, taxCode:Option[String] = None, description:Option[String] = None, itemGroup:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, classifications:Option[List[ClassificationModel]] = None, parameters:Option[List[ItemParameterModel]] = None)
  
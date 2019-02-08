package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UomModel(id:Option[Int] = None, code:Option[String] = None, shortDesc:Option[String] = None, description:Option[String] = None, measurementTypeId:Option[Int] = None, measurementTypeCode:Option[String] = None, siUOM:Option[String] = None, measurementTypeDescription:Option[String] = None, isSiUom:Option[Boolean] = None)
  
package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait PointOfSaleFileType
object PointOfSaleFileType {
  case object Json extends PointOfSaleFileType
  case object Csv  extends PointOfSaleFileType
  case object Xml  extends PointOfSaleFileType
}

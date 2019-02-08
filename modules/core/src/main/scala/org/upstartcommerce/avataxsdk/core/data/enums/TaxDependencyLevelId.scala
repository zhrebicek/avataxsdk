package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait TaxDependencyLevelId
object TaxDependencyLevelId {
  case object Document extends TaxDependencyLevelId
  case object State extends TaxDependencyLevelId
  case object TaxRegion extends TaxDependencyLevelId
  case object Address extends TaxDependencyLevelId
}
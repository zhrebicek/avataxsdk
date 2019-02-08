package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ResolutionQuality
object ResolutionQuality {
  case object NotCoded             extends ResolutionQuality
  case object External             extends ResolutionQuality
  case object CountryCentroid      extends ResolutionQuality
  case object RegionCentroid       extends ResolutionQuality
  case object PartialCentroid      extends ResolutionQuality
  case object PostalCentroidGood   extends ResolutionQuality
  case object PostalCentroidBetter extends ResolutionQuality
  case object PostalCentroidBest   extends ResolutionQuality
  case object Intersection         extends ResolutionQuality
  case object Interpolated         extends ResolutionQuality
  case object Rooftop              extends ResolutionQuality
  case object Constant             extends ResolutionQuality
}

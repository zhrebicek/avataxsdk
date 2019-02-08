package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FillingFrequencyId
object FillingFrequencyId {
  case object Monthly          extends FillingFrequencyId
  case object Quarterly        extends FillingFrequencyId
  case object SemiAnnually     extends FillingFrequencyId
  case object Annually         extends FillingFrequencyId
  case object Bimonthly        extends FillingFrequencyId
  case object Occasional       extends FillingFrequencyId
  case object InverseQuarterly extends FillingFrequencyId
}

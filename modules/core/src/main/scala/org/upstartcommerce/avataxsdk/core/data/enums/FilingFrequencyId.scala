package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FilingFrequencyId
object FilingFrequencyId {
  case object Monthly          extends FilingFrequencyId
  case object Quarterly        extends FilingFrequencyId
  case object SemiAnnually     extends FilingFrequencyId
  case object Annually         extends FilingFrequencyId
  case object Bimonthly        extends FilingFrequencyId
  case object Occasional       extends FilingFrequencyId
  case object InverseQuarterly extends FilingFrequencyId
}

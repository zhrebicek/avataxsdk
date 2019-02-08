package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait FundingOption
object FundingOption {
  case object Pull extends FundingOption
  case object Wire extends FundingOption
}

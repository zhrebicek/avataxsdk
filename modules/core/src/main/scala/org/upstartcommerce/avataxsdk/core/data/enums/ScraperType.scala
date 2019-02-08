package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ScraperType
object ScraperType {
  case object Login           extends ScraperType
  case object CustomerDorData extends ScraperType
}

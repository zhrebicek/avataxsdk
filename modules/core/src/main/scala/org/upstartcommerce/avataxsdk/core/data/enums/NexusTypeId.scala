package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait NexusTypeId
object NexusTypeId {
  case object None extends NexusTypeId
  case object SalesOrSellersUseTax extends NexusTypeId
  case object SalesTax extends NexusTypeId
  case object SSTVolunteer extends NexusTypeId
  case object SSTNonVolunteer extends NexusTypeId
}
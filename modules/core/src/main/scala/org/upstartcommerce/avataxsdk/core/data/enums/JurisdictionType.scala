package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait JurisdictionType
object JurisdictionType {
  case object Country extends JurisdictionType
  case object State   extends JurisdictionType
  case object County  extends JurisdictionType
  case object City    extends JurisdictionType
  case object Special extends JurisdictionType
}

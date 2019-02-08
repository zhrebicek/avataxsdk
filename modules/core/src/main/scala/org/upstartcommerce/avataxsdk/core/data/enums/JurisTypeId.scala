package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait JurisTypeId
object JurisTypeId {
  case object STA extends JurisTypeId
  case object CTY extends JurisTypeId
  case object CIT extends JurisTypeId
  case object STJ extends JurisTypeId
  case object CNT extends JurisTypeId
}
package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ParameterBagDataType
object ParameterBagDataType {
  case object String extends ParameterBagDataType
  case object Boolean extends ParameterBagDataType
  case object Numeric extends ParameterBagDataType
}
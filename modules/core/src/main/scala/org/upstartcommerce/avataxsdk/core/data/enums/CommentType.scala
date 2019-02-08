package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait CommentType
object CommentType {
  case object Internal extends CommentType
  case object Customer extends CommentType
}
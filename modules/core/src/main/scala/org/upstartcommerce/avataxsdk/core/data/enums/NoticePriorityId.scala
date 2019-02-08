package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait NoticePriorityId
object NoticePriorityId {
  case object ImmediateAttentionRequired extends NoticePriorityId
  case object High extends NoticePriorityId
  case object Normal extends NoticePriorityId
  case object Low extends NoticePriorityId
}
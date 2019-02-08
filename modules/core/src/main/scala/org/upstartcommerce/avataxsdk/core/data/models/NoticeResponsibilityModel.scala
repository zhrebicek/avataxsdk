package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeResponsibilityModel(id:Option[Int] = None, description:Option[String] = None, isActive:Option[Boolean] = None, sortOrder:Option[Int] = None)
  
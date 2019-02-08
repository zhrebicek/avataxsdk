package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UsernameModel(username:Option[String] = None, taken:Option[Boolean] = None)
  
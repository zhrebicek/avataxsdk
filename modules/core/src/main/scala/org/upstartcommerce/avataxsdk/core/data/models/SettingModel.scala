package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SettingModel(id:Option[Int] = None, companyId:Option[Int] = None, set:Option[String] = None, name:Option[String] = None, value:Option[String] = None)
  
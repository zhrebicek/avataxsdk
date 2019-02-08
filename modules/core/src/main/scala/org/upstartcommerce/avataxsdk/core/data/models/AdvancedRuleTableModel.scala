package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AdvancedRuleTableModel(id:Option[Long] = None, accountId:Option[Int] = None, csvTableName:Option[String] = None, csvTable:Option[String] = None)
  
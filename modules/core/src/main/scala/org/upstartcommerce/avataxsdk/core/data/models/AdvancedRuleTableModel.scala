package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AdvancedRuleTableModel(id:Option[Long] = None, accountId:Option[Int] = None, csvTableName:Option[String] = None, csvTable:Option[String] = None) {
  def withId(value:Long):AdvancedRuleTableModel = copy(id = Some(value))
  def withAccountId(value:Int):AdvancedRuleTableModel = copy(accountId = Some(value))
  def withCsvTableName(value:String):AdvancedRuleTableModel = copy(csvTableName = Some(value))
  def withCsvTable(value:String):AdvancedRuleTableModel = copy(csvTable = Some(value))
}
  
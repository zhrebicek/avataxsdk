package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class SettingModel(id:Option[Int] = None, companyId:Option[Int] = None, set:Option[String] = None, name:Option[String] = None, value:Option[String] = None) {
  def withId(value:Int):SettingModel = copy(id = Some(value))
  def withCompanyId(value:Int):SettingModel = copy(companyId = Some(value))
  def withSet(value:String):SettingModel = copy(set = Some(value))
  def withName(value:String):SettingModel = copy(name = Some(value))
  def withValue(value:String):SettingModel = copy(value = Some(value))
}
  
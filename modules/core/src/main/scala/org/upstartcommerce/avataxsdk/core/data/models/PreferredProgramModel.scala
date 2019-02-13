package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class PreferredProgramModel(id:Option[Int] = None, code:Option[String] = None, originCountry:Option[String] = None, destinationCountry:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None) {

  def withId(value:Int):PreferredProgramModel = copy(id = Some(value))
  def withCode(value:String):PreferredProgramModel = copy(code = Some(value))
  def withOriginCountry(value:String):PreferredProgramModel = copy(originCountry = Some(value))
  def withDestinationCountry(value:String):PreferredProgramModel = copy(destinationCountry = Some(value))
  def withEffectiveDate(value:Date):PreferredProgramModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):PreferredProgramModel = copy(endDate = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class HsCodeModel(hsCode:Option[String] = None, id:Option[Long] = None, parentHsCodeId:Option[Long] = None, description:Option[String] = None, system:Option[String] = None, destinationCountry:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None) {

  def withHsCode(value:String):HsCodeModel = copy(hsCode = Some(value))
  def withId(value:Long):HsCodeModel = copy(id = Some(value))
  def withParentHsCodeId(value:Long):HsCodeModel = copy(parentHsCodeId = Some(value))
  def withDescription(value:String):HsCodeModel = copy(description = Some(value))
  def withSystem(value:String):HsCodeModel = copy(system = Some(value))
  def withDestinationCountry(value:String):HsCodeModel = copy(destinationCountry = Some(value))
  def withEffDate(value:Date):HsCodeModel = copy(effDate = Some(value))
  def withEndDate(value:Date):HsCodeModel = copy(endDate = Some(value))
}
  
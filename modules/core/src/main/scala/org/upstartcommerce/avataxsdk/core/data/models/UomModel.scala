package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UomModel(id:Option[Int] = None, code:Option[String] = None, shortDesc:Option[String] = None, description:Option[String] = None, measurementTypeId:Option[Int] = None, measurementTypeCode:Option[String] = None, siUOM:Option[String] = None, measurementTypeDescription:Option[String] = None, isSiUom:Option[Boolean] = None) {

  def withId(value:Int):UomModel = copy(id = Some(value))
  def withCode(value:String):UomModel = copy(code = Some(value))
  def withShortDesc(value:String):UomModel = copy(shortDesc = Some(value))
  def withDescription(value:String):UomModel = copy(description = Some(value))
  def withMeasurementTypeId(value:Int):UomModel = copy(measurementTypeId = Some(value))
  def withMeasurementTypeCode(value:String):UomModel = copy(measurementTypeCode = Some(value))
  def withSiUOM(value:String):UomModel = copy(siUOM = Some(value))
  def withMeasurementTypeDescription(value:String):UomModel = copy(measurementTypeDescription = Some(value))
  def withIsSiUom(value:Boolean):UomModel = copy(isSiUom = Some(value))
}
  
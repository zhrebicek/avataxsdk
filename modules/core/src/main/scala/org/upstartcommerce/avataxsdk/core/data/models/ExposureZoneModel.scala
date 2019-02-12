package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ExposureZoneModel(id:Option[Int] = None, companyId:Option[Int] = None, name:Option[String] = None, tag:Option[String] = None, description:Option[String] = None, created:Option[Date] = None, modified:Option[Date] = None, region:Option[String] = None, country:Option[String] = None) {
  def withId(value:Int):ExposureZoneModel = copy(id = Some(value))
  def withCompanyId(value:Int):ExposureZoneModel = copy(companyId = Some(value))
  def withName(value:String):ExposureZoneModel = copy(name = Some(value))
  def withTag(value:String):ExposureZoneModel = copy(tag = Some(value))
  def withDescription(value:String):ExposureZoneModel = copy(description = Some(value))
  def withCreated(value:Date):ExposureZoneModel = copy(created = Some(value))
  def withModified(value:Date):ExposureZoneModel = copy(modified = Some(value))
  def withRegion(value:String):ExposureZoneModel = copy(region = Some(value))
  def withCountry(value:String):ExposureZoneModel = copy(country = Some(value))
}
  
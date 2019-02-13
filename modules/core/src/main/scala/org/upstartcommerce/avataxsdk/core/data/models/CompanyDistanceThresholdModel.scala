package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CompanyDistanceThresholdModel(id:Option[Long] = None, companyId:Option[Int] = None, originCountry:Option[String] = None, destinationCountry:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None, thresholdExceeded:Option[Boolean] = None, `type`:Option[String] = None) {

  def withId(value:Long):CompanyDistanceThresholdModel = copy(id = Some(value))
  def withCompanyId(value:Int):CompanyDistanceThresholdModel = copy(companyId = Some(value))
  def withOriginCountry(value:String):CompanyDistanceThresholdModel = copy(originCountry = Some(value))
  def withDestinationCountry(value:String):CompanyDistanceThresholdModel = copy(destinationCountry = Some(value))
  def withEffDate(value:Date):CompanyDistanceThresholdModel = copy(effDate = Some(value))
  def withEndDate(value:Date):CompanyDistanceThresholdModel = copy(endDate = Some(value))
  def withThresholdExceeded(value:Boolean):CompanyDistanceThresholdModel = copy(thresholdExceeded = Some(value))
  def withType(value:String):CompanyDistanceThresholdModel = copy(`type` = Some(value))
}
  
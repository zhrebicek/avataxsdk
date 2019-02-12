package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LocationQuestionModel(id:Option[Int] = None, question:Option[String] = None, description:Option[String] = None, regularExpression:Option[String] = None, exampleValue:Option[String] = None, jurisdictionName:Option[String] = None, jurisdictionType:Option[JurisdictionType] = None, jurisdictionCountry:Option[String] = None, jurisdictionRegion:Option[String] = None) {
  def withId(value:Int):LocationQuestionModel = copy(id = Some(value))
  def withQuestion(value:String):LocationQuestionModel = copy(question = Some(value))
  def withDescription(value:String):LocationQuestionModel = copy(description = Some(value))
  def withRegularExpression(value:String):LocationQuestionModel = copy(regularExpression = Some(value))
  def withExampleValue(value:String):LocationQuestionModel = copy(exampleValue = Some(value))
  def withJurisdictionName(value:String):LocationQuestionModel = copy(jurisdictionName = Some(value))
  def withJurisdictionType(value:JurisdictionType):LocationQuestionModel = copy(jurisdictionType = Some(value))
  def withJurisdictionCountry(value:String):LocationQuestionModel = copy(jurisdictionCountry = Some(value))
  def withJurisdictionRegion(value:String):LocationQuestionModel = copy(jurisdictionRegion = Some(value))
}
  
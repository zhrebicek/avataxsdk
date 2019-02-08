package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LocationQuestionModel(id:Option[Int] = None, question:Option[String] = None, description:Option[String] = None, regularExpression:Option[String] = None, exampleValue:Option[String] = None, jurisdictionName:Option[String] = None, jurisdictionType:Option[JurisdictionType] = None, jurisdictionCountry:Option[String] = None, jurisdictionRegion:Option[String] = None)
  
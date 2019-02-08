package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ParameterModel(id:Option[Long] = None, category:Option[String] = None, name:Option[String] = None, dataType:Option[String] = None, helpText:Option[String] = None, serviceTypes:Option[List[String]] = None, prompt:Option[String] = None, regularExpression:Option[String] = None, label:Option[String] = None, helpUrl:Option[String] = None, attributeType:Option[String] = None, values:Option[List[String]] = None, measurementType:Option[String] = None)
  
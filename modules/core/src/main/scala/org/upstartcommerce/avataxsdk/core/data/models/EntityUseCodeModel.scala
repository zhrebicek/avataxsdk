package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class EntityUseCodeModel(code:Option[String] = None, name:Option[String] = None, description:Option[String] = None, validCountries:Option[List[String]] = None)
  
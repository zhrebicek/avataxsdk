package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class IsoLocalizedName(languageAlpha2Code:Option[String] = None, languageAlpha3Code:Option[String] = None, name:Option[String] = None)
  
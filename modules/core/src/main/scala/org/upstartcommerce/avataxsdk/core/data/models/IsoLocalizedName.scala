package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class IsoLocalizedName(languageAlpha2Code:Option[String] = None, languageAlpha3Code:Option[String] = None, name:Option[String] = None) {

  def withLanguageAlpha2Code(value:String):IsoLocalizedName = copy(languageAlpha2Code = Some(value))
  def withLanguageAlpha3Code(value:String):IsoLocalizedName = copy(languageAlpha3Code = Some(value))
  def withName(value:String):IsoLocalizedName = copy(name = Some(value))
}
  
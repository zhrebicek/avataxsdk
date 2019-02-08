package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingsCheckupSuggestedFormModel(taxAuthorityId:Option[Int] = None, country:Option[String] = None, region:Option[String] = None, returnName:Option[String] = None, taxFormCode:Option[String] = None)
  
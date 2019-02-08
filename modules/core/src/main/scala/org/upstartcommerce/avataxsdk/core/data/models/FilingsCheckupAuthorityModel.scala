package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingsCheckupAuthorityModel(taxAuthorityId:Option[Int] = None, locationCode:Option[String] = None, taxAuthorityName:Option[String] = None, taxAuthorityTypeId:Option[Int] = None, jurisdictionId:Option[Int] = None, tax:Option[BigDecimal] = None, taxTypeId:Option[String] = None, suggestedForms:Option[List[FilingsCheckupSuggestedFormModel]] = None)
  
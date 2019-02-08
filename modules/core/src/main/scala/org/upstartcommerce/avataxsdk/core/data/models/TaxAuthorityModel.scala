package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxAuthorityModel(id:Option[Int] = None, name:Option[String] = None, taxAuthorityTypeId:Option[Int] = None, jurisdictionId:Option[Int] = None)
  
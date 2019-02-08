package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxAuthorityTypeModel(id:Option[Int] = None, description:Option[String] = None, taxAuthorityGroup:Option[String] = None)
  
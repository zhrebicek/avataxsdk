package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxAuthorityFormModel(taxAuthorityId:Option[Int] = None, formName:Option[String] = None)
  
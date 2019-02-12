package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxAuthorityFormModel(taxAuthorityId:Option[Int] = None, formName:Option[String] = None) {
  def withTaxAuthorityId(value:Int):TaxAuthorityFormModel = copy(taxAuthorityId = Some(value))
  def withFormName(value:String):TaxAuthorityFormModel = copy(formName = Some(value))
}
  
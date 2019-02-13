package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxAuthorityTypeModel(id:Option[Int] = None, description:Option[String] = None, taxAuthorityGroup:Option[String] = None) {

  def withId(value:Int):TaxAuthorityTypeModel = copy(id = Some(value))
  def withDescription(value:String):TaxAuthorityTypeModel = copy(description = Some(value))
  def withTaxAuthorityGroup(value:String):TaxAuthorityTypeModel = copy(taxAuthorityGroup = Some(value))
}
  
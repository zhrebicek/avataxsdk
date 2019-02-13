package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxAuthorityModel(id:Option[Int] = None, name:Option[String] = None, taxAuthorityTypeId:Option[Int] = None, jurisdictionId:Option[Int] = None) {

  def withId(value:Int):TaxAuthorityModel = copy(id = Some(value))
  def withName(value:String):TaxAuthorityModel = copy(name = Some(value))
  def withTaxAuthorityTypeId(value:Int):TaxAuthorityModel = copy(taxAuthorityTypeId = Some(value))
  def withJurisdictionId(value:Int):TaxAuthorityModel = copy(jurisdictionId = Some(value))
}
  
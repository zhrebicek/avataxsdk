package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxSubTypeModel(id:Option[Int] = None, taxSubType:Option[String] = None, description:Option[String] = None, taxTypeGroup:Option[String] = None) {

  def withId(value:Int):TaxSubTypeModel = copy(id = Some(value))
  def withTaxSubType(value:String):TaxSubTypeModel = copy(taxSubType = Some(value))
  def withDescription(value:String):TaxSubTypeModel = copy(description = Some(value))
  def withTaxTypeGroup(value:String):TaxSubTypeModel = copy(taxTypeGroup = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CertificateTaxCodeModel(id:Option[Int] = None, name:Option[String] = None, tag:Option[String] = None) {

  def withId(value:Int):CertificateTaxCodeModel = copy(id = Some(value))
  def withName(value:String):CertificateTaxCodeModel = copy(name = Some(value))
  def withTag(value:String):CertificateTaxCodeModel = copy(tag = Some(value))
}
  
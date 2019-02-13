package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CertificateAttributeModel(id:Option[Int] = None, name:Option[String] = None, description:Option[String] = None, isSystemCode:Option[Boolean] = None) {

  def withId(value:Int):CertificateAttributeModel = copy(id = Some(value))
  def withName(value:String):CertificateAttributeModel = copy(name = Some(value))
  def withDescription(value:String):CertificateAttributeModel = copy(description = Some(value))
  def withIsSystemCode(value:Boolean):CertificateAttributeModel = copy(isSystemCode = Some(value))
}
  
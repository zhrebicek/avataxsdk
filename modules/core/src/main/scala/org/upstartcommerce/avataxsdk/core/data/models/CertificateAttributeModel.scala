package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CertificateAttributeModel(id:Option[Int] = None, name:Option[String] = None, description:Option[String] = None, isSystemCode:Option[Boolean] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LinkCertificatesModel(certificates:List[Int] = List.empty) {
  def withCertificates(value:List[Int]):LinkCertificatesModel = copy(certificates = value)
}
  
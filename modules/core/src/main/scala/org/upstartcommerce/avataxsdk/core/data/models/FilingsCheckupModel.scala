package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingsCheckupModel(authorities:Option[List[FilingsCheckupAuthorityModel]] = None) {
  lazy val authoritiesRaw:List[FilingsCheckupAuthorityModel] = authorities.getOrElse(List.empty)
  def withAuthorities(value:List[FilingsCheckupAuthorityModel]):FilingsCheckupModel = copy(authorities = Some(value))
}
  
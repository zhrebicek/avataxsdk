package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UserEntitlementModel(permissions:Option[List[String]] = None, accessLevel:Option[CompanyAccessLevel] = None, companies:Option[List[Int]] = None)
  
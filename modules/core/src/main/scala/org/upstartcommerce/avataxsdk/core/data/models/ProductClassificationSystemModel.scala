package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ProductClassificationSystemModel(systemId:Option[Int] = None, systemCode:Option[String] = None, description:Option[String] = None, customsValue:Option[String] = None, countries:Option[List[ProductSystemCountryModel]] = None)
  
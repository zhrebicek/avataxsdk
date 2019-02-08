package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LineItemModel(number:Option[String] = None, quantity:Option[BigDecimal] = None, amount:Option[BigDecimal] = None, addresses:Option[AddressesModel] = None, taxCode:Option[String] = None, customerUsageType:Option[String] = None, entityUseCode:Option[String] = None, itemCode:Option[String] = None, exemptionCode:Option[String] = None, discounted:Option[Boolean] = None, taxIncluded:Option[Boolean] = None, revenueAccount:Option[String] = None, ref1:Option[String] = None, ref2:Option[String] = None, description:Option[String] = None, businessIdentificationNo:Option[String] = None, taxOverride:Option[TaxOverrideModel] = None, parameters:Option[Map[String, String]] = None, hsCode:Option[String] = None)
  
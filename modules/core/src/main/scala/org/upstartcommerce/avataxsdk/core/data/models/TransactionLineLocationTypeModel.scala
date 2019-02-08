package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TransactionLineLocationTypeModel(documentLineLocationTypeId:Option[Long] = None, documentLineId:Option[Long] = None, documentAddressId:Option[Long] = None, locationTypeCode:Option[String] = None)
  
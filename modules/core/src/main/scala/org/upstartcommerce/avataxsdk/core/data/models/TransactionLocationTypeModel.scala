package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TransactionLocationTypeModel(documentLocationTypeId:Option[Long] = None, documentId:Option[Long] = None, documentAddressId:Option[Long] = None, locationTypeCode:Option[String] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TransactionLocationTypeModel(documentLocationTypeId:Option[Long] = None, documentId:Option[Long] = None, documentAddressId:Option[Long] = None, locationTypeCode:Option[String] = None) {
  def withDocumentLocationTypeId(value:Long):TransactionLocationTypeModel = copy(documentLocationTypeId = Some(value))
  def withDocumentId(value:Long):TransactionLocationTypeModel = copy(documentId = Some(value))
  def withDocumentAddressId(value:Long):TransactionLocationTypeModel = copy(documentAddressId = Some(value))
  def withLocationTypeCode(value:String):TransactionLocationTypeModel = copy(locationTypeCode = Some(value))
}
  
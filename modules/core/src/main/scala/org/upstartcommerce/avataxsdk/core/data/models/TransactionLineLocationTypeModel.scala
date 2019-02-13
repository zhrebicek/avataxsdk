package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TransactionLineLocationTypeModel(documentLineLocationTypeId:Option[Long] = None, documentLineId:Option[Long] = None, documentAddressId:Option[Long] = None, locationTypeCode:Option[String] = None) {

  def withDocumentLineLocationTypeId(value:Long):TransactionLineLocationTypeModel = copy(documentLineLocationTypeId = Some(value))
  def withDocumentLineId(value:Long):TransactionLineLocationTypeModel = copy(documentLineId = Some(value))
  def withDocumentAddressId(value:Long):TransactionLineLocationTypeModel = copy(documentAddressId = Some(value))
  def withLocationTypeCode(value:String):TransactionLineLocationTypeModel = copy(locationTypeCode = Some(value))
}
  
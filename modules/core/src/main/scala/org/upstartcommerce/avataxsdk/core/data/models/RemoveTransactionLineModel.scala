package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class RemoveTransactionLineModel(companyCode:Option[String] = None, transactionCode:Option[String] = None, documentType:Option[DocumentType] = None, lines:List[String] = List.empty, renumber:Option[Boolean] = None) {
  def withCompanyCode(value:String):RemoveTransactionLineModel = copy(companyCode = Some(value))
  def withTransactionCode(value:String):RemoveTransactionLineModel = copy(transactionCode = Some(value))
  def withDocumentType(value:DocumentType):RemoveTransactionLineModel = copy(documentType = Some(value))
  def withLines(value:List[String]):RemoveTransactionLineModel = copy(lines = value)
  def withRenumber(value:Boolean):RemoveTransactionLineModel = copy(renumber = Some(value))
}
  
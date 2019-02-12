package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddTransactionLineModel(companyCode:Option[String] = None, transactionCode:Option[String] = None, documentType:Option[DocumentType] = None, lines:List[LineItemModel] = List.empty, renumber:Option[Boolean] = None) {
  def withCompanyCode(value:String):AddTransactionLineModel = copy(companyCode = Some(value))
  def withTransactionCode(value:String):AddTransactionLineModel = copy(transactionCode = Some(value))
  def withDocumentType(value:DocumentType):AddTransactionLineModel = copy(documentType = Some(value))
  def withLines(value:List[LineItemModel]):AddTransactionLineModel = copy(lines = value)
  def withRenumber(value:Boolean):AddTransactionLineModel = copy(renumber = Some(value))
}
  
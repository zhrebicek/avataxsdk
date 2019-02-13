package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TransactionReferenceFieldModel(documentId:Option[Long] = None, reportingLocationCode:Option[String] = None, lineDetailSerCodes:Option[List[LineDetailSERCodeModel]] = None) {
  lazy val lineDetailSerCodesRaw:List[LineDetailSERCodeModel] = lineDetailSerCodes.getOrElse(List.empty)
  def withDocumentId(value:Long):TransactionReferenceFieldModel = copy(documentId = Some(value))
  def withReportingLocationCode(value:String):TransactionReferenceFieldModel = copy(reportingLocationCode = Some(value))
  def withLineDetailSerCodes(value:List[LineDetailSERCodeModel]):TransactionReferenceFieldModel = copy(lineDetailSerCodes = Some(value))
}
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddTransactionLineModel(companyCode:Option[String] = None, transactionCode:Option[String] = None, documentType:Option[DocumentType] = None, lines:Option[List[LineItemModel]] = None, renumber:Option[Boolean] = None)
  
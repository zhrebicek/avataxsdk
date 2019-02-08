package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TransactionReferenceFieldModel(documentId:Option[Long] = None, reportingLocationCode:Option[String] = None, lineDetailSerCodes:Option[List[LineDetailSERCodeModel]] = None)
  
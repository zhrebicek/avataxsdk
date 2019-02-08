package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class MultiDocumentModel(id:Option[Long] = None, accountId:Option[Int] = None, code:Option[String] = None, `type`:Option[DocumentType] = None, createdUserId:Option[Int] = None, createdDate:Option[Date] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, documents:Option[List[TransactionModel]] = None)
  
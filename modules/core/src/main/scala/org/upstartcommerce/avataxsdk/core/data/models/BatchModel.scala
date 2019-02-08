package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class BatchModel(id:Option[Int] = None, name:Option[String] = None, accountId:Option[Int] = None, companyId:Option[Int] = None, `type`:Option[BatchType] = None, status:Option[BatchStatus] = None, options:Option[String] = None, batchAgent:Option[String] = None, startedDate:Option[Date] = None, recordCount:Option[Int] = None, currentRecord:Option[Int] = None, completedDate:Option[Date] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, files:Option[List[BatchFileModel]] = None)
  
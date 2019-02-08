package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeFinanceModel(id:Option[Int] = None, noticeId:Option[Int] = None, noticeDate:Option[Date] = None, dueDate:Option[Date] = None, noticeNumber:Option[String] = None, taxDue:Option[BigDecimal] = None, penalty:Option[BigDecimal] = None, interest:Option[BigDecimal] = None, credits:Option[BigDecimal] = None, taxAbated:Option[BigDecimal] = None, customerPenalty:Option[BigDecimal] = None, customerInterest:Option[BigDecimal] = None, cspFeeRefund:Option[BigDecimal] = None, fileName:Option[String] = None, resourceFileId:Option[Long] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, attachmentUploadRequest:Option[ResourceFileUploadRequestModel] = None)
  
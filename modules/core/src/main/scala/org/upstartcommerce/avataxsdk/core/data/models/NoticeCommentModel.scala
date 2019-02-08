package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeCommentModel(id:Option[Int] = None, noticeId:Option[Int] = None, date:Option[Date] = None, comment:Option[String] = None, commentUserId:Option[Int] = None, commentUserName:Option[String] = None, commentTypeId:Option[Int] = None, commentType:Option[CommentType] = None, commentLink:Option[String] = None, taxNoticeFileName:Option[String] = None, resourceFileId:Option[Long] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, attachmentUploadRequest:Option[ResourceFileUploadRequestModel] = None)
  
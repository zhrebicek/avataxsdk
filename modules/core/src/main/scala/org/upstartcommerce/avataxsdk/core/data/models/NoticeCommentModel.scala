package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeCommentModel(id:Option[Int] = None, noticeId:Option[Int] = None, date:Option[Date] = None, comment:Option[String] = None, commentUserId:Option[Int] = None, commentUserName:Option[String] = None, commentTypeId:Option[Int] = None, commentType:Option[CommentType] = None, commentLink:Option[String] = None, taxNoticeFileName:Option[String] = None, resourceFileId:Option[Long] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, attachmentUploadRequest:Option[ResourceFileUploadRequestModel] = None) {
  def withId(value:Int):NoticeCommentModel = copy(id = Some(value))
  def withNoticeId(value:Int):NoticeCommentModel = copy(noticeId = Some(value))
  def withDate(value:Date):NoticeCommentModel = copy(date = Some(value))
  def withComment(value:String):NoticeCommentModel = copy(comment = Some(value))
  def withCommentUserId(value:Int):NoticeCommentModel = copy(commentUserId = Some(value))
  def withCommentUserName(value:String):NoticeCommentModel = copy(commentUserName = Some(value))
  def withCommentTypeId(value:Int):NoticeCommentModel = copy(commentTypeId = Some(value))
  def withCommentType(value:CommentType):NoticeCommentModel = copy(commentType = Some(value))
  def withCommentLink(value:String):NoticeCommentModel = copy(commentLink = Some(value))
  def withTaxNoticeFileName(value:String):NoticeCommentModel = copy(taxNoticeFileName = Some(value))
  def withResourceFileId(value:Long):NoticeCommentModel = copy(resourceFileId = Some(value))
  def withModifiedDate(value:Date):NoticeCommentModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):NoticeCommentModel = copy(modifiedUserId = Some(value))
  def withAttachmentUploadRequest(value:ResourceFileUploadRequestModel):NoticeCommentModel = copy(attachmentUploadRequest = Some(value))
}
  
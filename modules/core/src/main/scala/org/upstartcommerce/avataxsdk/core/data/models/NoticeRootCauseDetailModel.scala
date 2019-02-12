package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeRootCauseDetailModel(id:Option[Int] = None, noticeId:Option[Int] = None, taxNoticeRootCauseId:Option[Int] = None, description:Option[String] = None) {
  def withId(value:Int):NoticeRootCauseDetailModel = copy(id = Some(value))
  def withNoticeId(value:Int):NoticeRootCauseDetailModel = copy(noticeId = Some(value))
  def withTaxNoticeRootCauseId(value:Int):NoticeRootCauseDetailModel = copy(taxNoticeRootCauseId = Some(value))
  def withDescription(value:String):NoticeRootCauseDetailModel = copy(description = Some(value))
}
  
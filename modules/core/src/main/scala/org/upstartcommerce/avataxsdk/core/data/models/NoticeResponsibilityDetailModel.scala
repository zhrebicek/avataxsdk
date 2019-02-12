package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeResponsibilityDetailModel(id:Option[Int] = None, noticeId:Option[Int] = None, taxNoticeResponsibilityId:Option[Int] = None, description:Option[String] = None) {
  def withId(value:Int):NoticeResponsibilityDetailModel = copy(id = Some(value))
  def withNoticeId(value:Int):NoticeResponsibilityDetailModel = copy(noticeId = Some(value))
  def withTaxNoticeResponsibilityId(value:Int):NoticeResponsibilityDetailModel = copy(taxNoticeResponsibilityId = Some(value))
  def withDescription(value:String):NoticeResponsibilityDetailModel = copy(description = Some(value))
}
  
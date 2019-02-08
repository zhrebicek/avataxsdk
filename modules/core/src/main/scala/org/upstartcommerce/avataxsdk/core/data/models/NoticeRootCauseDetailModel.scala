package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NoticeRootCauseDetailModel(id:Option[Int] = None, noticeId:Option[Int] = None, taxNoticeRootCauseId:Option[Int] = None, description:Option[String] = None)
  
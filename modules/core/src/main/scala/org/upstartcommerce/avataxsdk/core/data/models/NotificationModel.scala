package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NotificationModel(id:Option[Long] = None, accountId:Option[Int] = None, companyId:Option[Int] = None, referenceObject:Option[String] = None, referenceId:Option[Long] = None, severityLevelId:Option[NotificationSeverityLevel] = None, category:Option[String] = None, topic:Option[String] = None, message:Option[String] = None, needsAction:Option[Boolean] = None, actionName:Option[String] = None, actionLink:Option[String] = None, actionDueDate:Option[Date] = None, dismissed:Option[Boolean] = None, dismissedByUserId:Option[Int] = None, dismissedDate:Option[Date] = None, expireDate:Option[Date] = None, createdUserId:Option[Int] = None, createdDate:Option[Date] = None, modifiedUserId:Option[Int] = None, modifiedDate:Option[Date] = None)
  
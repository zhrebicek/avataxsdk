package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AuditEvent(auditEventId:Option[Long] = None, transactionId:Option[Long] = None, auditEventLevelId:Option[Int] = None, eventTimestamp:Option[Date] = None, source:Option[String] = None, summary:Option[String] = None, details:Option[String] = None)
  
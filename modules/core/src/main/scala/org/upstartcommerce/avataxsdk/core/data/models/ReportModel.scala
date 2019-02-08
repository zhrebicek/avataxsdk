package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ReportModel(id:Option[Long] = None, accountId:Option[Int] = None, companyId:Option[Int] = None, reportType:Option[String] = None, parameters:Option[ReportParametersModel] = None, status:Option[String] = None, size:Option[Int] = None, format:Option[String] = None, file:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, createdUser:Option[String] = None, completedDate:Option[Date] = None)
  
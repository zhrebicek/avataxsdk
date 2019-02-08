package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LoginVerificationOutputModel(jobId:Option[Int] = None, operationStatus:Option[String] = None, message:Option[String] = None, loginSuccess:Option[Boolean] = None)
  
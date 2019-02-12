package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LoginVerificationOutputModel(jobId:Option[Int] = None, operationStatus:Option[String] = None, message:Option[String] = None, loginSuccess:Option[Boolean] = None) {
  def withJobId(value:Int):LoginVerificationOutputModel = copy(jobId = Some(value))
  def withOperationStatus(value:String):LoginVerificationOutputModel = copy(operationStatus = Some(value))
  def withMessage(value:String):LoginVerificationOutputModel = copy(message = Some(value))
  def withLoginSuccess(value:Boolean):LoginVerificationOutputModel = copy(loginSuccess = Some(value))
}
  
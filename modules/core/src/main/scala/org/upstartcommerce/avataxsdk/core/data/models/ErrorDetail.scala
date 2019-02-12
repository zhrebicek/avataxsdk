package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ErrorDetail(code:Option[ErrorCodeId] = None, number:Option[Int] = None, message:Option[String] = None, description:Option[String] = None, faultCode:Option[String] = None, helpLink:Option[String] = None, refersTo:Option[String] = None, severity:Option[SeverityLevel] = None) {
  def withCode(value:ErrorCodeId):ErrorDetail = copy(code = Some(value))
  def withNumber(value:Int):ErrorDetail = copy(number = Some(value))
  def withMessage(value:String):ErrorDetail = copy(message = Some(value))
  def withDescription(value:String):ErrorDetail = copy(description = Some(value))
  def withFaultCode(value:String):ErrorDetail = copy(faultCode = Some(value))
  def withHelpLink(value:String):ErrorDetail = copy(helpLink = Some(value))
  def withRefersTo(value:String):ErrorDetail = copy(refersTo = Some(value))
  def withSeverity(value:SeverityLevel):ErrorDetail = copy(severity = Some(value))
}
  
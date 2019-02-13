package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ErrorResult(error:Option[ErrorInfo] = None) {

  def withError(value:ErrorInfo):ErrorResult = copy(error = Some(value))
}
  
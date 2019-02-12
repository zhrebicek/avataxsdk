package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AvaTaxMessage(summary:Option[String] = None, details:Option[String] = None, refersTo:Option[String] = None, severity:Option[String] = None, source:Option[String] = None) {
  def withSummary(value:String):AvaTaxMessage = copy(summary = Some(value))
  def withDetails(value:String):AvaTaxMessage = copy(details = Some(value))
  def withRefersTo(value:String):AvaTaxMessage = copy(refersTo = Some(value))
  def withSeverity(value:String):AvaTaxMessage = copy(severity = Some(value))
  def withSource(value:String):AvaTaxMessage = copy(source = Some(value))
}
  
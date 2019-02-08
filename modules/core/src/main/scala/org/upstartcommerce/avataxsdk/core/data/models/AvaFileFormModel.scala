package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AvaFileFormModel(id:Option[Int] = None, returnName:Option[String] = None, formName:Option[String] = None, description:Option[String] = None, effDate:Option[Date] = None, endDate:Option[Date] = None, region:Option[String] = None, country:Option[String] = None, formTypeId:Option[FormTypeId] = None, filingOptionTypeId:Option[FilingOptionTypeId] = None, dueDateTypeId:Option[DueDateTypeId] = None, dueDay:Option[Int] = None, efileDueDateTypeId:Option[DueDateTypeId] = None, efileDueDay:Option[Int] = None, efileDueTime:Option[Date] = None, hasVendorDiscount:Option[Boolean] = None, roundingTypeId:Option[RoundingTypeId] = None, outletTypeId:Option[OutletTypeId] = None)
  
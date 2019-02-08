package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FundingStatusModel(requestId:Option[Long] = None, subledgerProfileID:Option[Int] = None, companyID:Option[String] = None, domain:Option[String] = None, recipient:Option[String] = None, sender:Option[String] = None, documentKey:Option[String] = None, documentType:Option[String] = None, documentName:Option[String] = None, methodReturn:Option[FundingESignMethodReturn] = None, status:Option[String] = None, errorMessage:Option[String] = None, lastPolled:Option[Date] = None, lastSigned:Option[Date] = None, lastActivated:Option[Date] = None, templateRequestId:Option[Long] = None)
  
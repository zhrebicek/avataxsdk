package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CoverLetterModel(id:Option[Int] = None, companyId:Option[Int] = None, title:Option[String] = None, subject:Option[String] = None, description:Option[String] = None, createdDate:Option[Date] = None, modifiedDate:Option[Date] = None, active:Option[Boolean] = None, pageCount:Option[Int] = None, templateFilename:Option[String] = None, version:Option[Int] = None)
  
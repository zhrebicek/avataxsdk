package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class MrsCompanyModel(companyId:Option[Int] = None, companyName:Option[String] = None, accountId:Option[Int] = None, accountName:Option[String] = None, tin:Option[String] = None, companyCode:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None)
  
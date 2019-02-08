package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class DataSourceModel(id:Option[Int] = None, companyId:Option[Int] = None, source:Option[String] = None, instance:Option[String] = None, isEnabled:Option[Boolean] = None, isSynced:Option[Boolean] = None, isAuthorized:Option[Boolean] = None, lastSyncedDate:Option[Date] = None, createdUserId:Option[Int] = None, createdDate:Option[Date] = None, modifiedUserId:Option[Int] = None, modifiedDate:Option[Date] = None, deletedDate:Option[Date] = None, recalculate:Option[Boolean] = None)
  
package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TransactionAddressModel(id:Option[Long] = None, transactionId:Option[Long] = None, boundaryLevel:Option[BoundaryLevel] = None, line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, postalCode:Option[String] = None, country:Option[String] = None, taxRegionId:Option[Int] = None, latitude:Option[String] = None, longitude:Option[String] = None)
  
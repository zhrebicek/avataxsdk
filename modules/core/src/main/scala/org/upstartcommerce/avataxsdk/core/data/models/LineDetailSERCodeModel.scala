package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LineDetailSERCodeModel(transactionLineDetailId:Option[Long] = None, serCode:Option[String] = None)
  
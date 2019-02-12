package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingAugmentationModel(id:Option[Long] = None, filingId:Option[Long] = None, fieldAmount:Option[BigDecimal] = None, fieldName:Option[String] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {
  def withId(value:Long):FilingAugmentationModel = copy(id = Some(value))
  def withFilingId(value:Long):FilingAugmentationModel = copy(filingId = Some(value))
  def withFieldAmount(value:BigDecimal):FilingAugmentationModel = copy(fieldAmount = Some(value))
  def withFieldName(value:String):FilingAugmentationModel = copy(fieldName = Some(value))
  def withCreatedDate(value:Date):FilingAugmentationModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):FilingAugmentationModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):FilingAugmentationModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):FilingAugmentationModel = copy(modifiedUserId = Some(value))
}
  
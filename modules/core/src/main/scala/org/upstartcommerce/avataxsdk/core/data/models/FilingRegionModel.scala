package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingRegionModel(id:Option[Long] = None, filingId:Option[Long] = None, country:Option[String] = None, region:Option[String] = None, salesAmount:Option[BigDecimal] = None, taxableAmount:Option[BigDecimal] = None, taxAmount:Option[BigDecimal] = None, taxDueAmount:Option[BigDecimal] = None, collectAmount:Option[BigDecimal] = None, totalRemittanceAmount:Option[BigDecimal] = None, nonTaxableAmount:Option[BigDecimal] = None, consumerUseTaxAmount:Option[BigDecimal] = None, consumerUseNonTaxableAmount:Option[BigDecimal] = None, consumerUseTaxableAmount:Option[BigDecimal] = None, approveDate:Option[Date] = None, startDate:Option[Date] = None, endDate:Option[Date] = None, hasNexus:Option[Boolean] = None, status:Option[FilingStatusId] = None, returns:List[FilingReturnModel] = List.empty, suggestReturns:List[FilingsCheckupSuggestedFormModel] = List.empty, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {
  def withId(value:Long):FilingRegionModel = copy(id = Some(value))
  def withFilingId(value:Long):FilingRegionModel = copy(filingId = Some(value))
  def withCountry(value:String):FilingRegionModel = copy(country = Some(value))
  def withRegion(value:String):FilingRegionModel = copy(region = Some(value))
  def withSalesAmount(value:BigDecimal):FilingRegionModel = copy(salesAmount = Some(value))
  def withTaxableAmount(value:BigDecimal):FilingRegionModel = copy(taxableAmount = Some(value))
  def withTaxAmount(value:BigDecimal):FilingRegionModel = copy(taxAmount = Some(value))
  def withTaxDueAmount(value:BigDecimal):FilingRegionModel = copy(taxDueAmount = Some(value))
  def withCollectAmount(value:BigDecimal):FilingRegionModel = copy(collectAmount = Some(value))
  def withTotalRemittanceAmount(value:BigDecimal):FilingRegionModel = copy(totalRemittanceAmount = Some(value))
  def withNonTaxableAmount(value:BigDecimal):FilingRegionModel = copy(nonTaxableAmount = Some(value))
  def withConsumerUseTaxAmount(value:BigDecimal):FilingRegionModel = copy(consumerUseTaxAmount = Some(value))
  def withConsumerUseNonTaxableAmount(value:BigDecimal):FilingRegionModel = copy(consumerUseNonTaxableAmount = Some(value))
  def withConsumerUseTaxableAmount(value:BigDecimal):FilingRegionModel = copy(consumerUseTaxableAmount = Some(value))
  def withApproveDate(value:Date):FilingRegionModel = copy(approveDate = Some(value))
  def withStartDate(value:Date):FilingRegionModel = copy(startDate = Some(value))
  def withEndDate(value:Date):FilingRegionModel = copy(endDate = Some(value))
  def withHasNexus(value:Boolean):FilingRegionModel = copy(hasNexus = Some(value))
  def withStatus(value:FilingStatusId):FilingRegionModel = copy(status = Some(value))
  def withReturns(value:List[FilingReturnModel]):FilingRegionModel = copy(returns = value)
  def withSuggestReturns(value:List[FilingsCheckupSuggestedFormModel]):FilingRegionModel = copy(suggestReturns = value)
  def withCreatedDate(value:Date):FilingRegionModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):FilingRegionModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):FilingRegionModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):FilingRegionModel = copy(modifiedUserId = Some(value))
}
  
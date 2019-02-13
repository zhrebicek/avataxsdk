package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class NexusModel(id:Option[Int] = None, companyId:Option[Int] = None, country:Option[String] = None, region:Option[String] = None, jurisTypeId:Option[JurisTypeId] = None, jurisdictionTypeId:Option[JurisdictionType] = None, jurisCode:Option[String] = None, jurisName:Option[String] = None, effectiveDate:Option[Date] = None, endDate:Option[Date] = None, shortName:Option[String] = None, signatureCode:Option[String] = None, stateAssignedNo:Option[String] = None, nexusTypeId:Option[NexusTypeId] = None, sourcing:Option[Sourcing] = None, hasLocalNexus:Option[Boolean] = None, localNexusTypeId:Option[LocalNexusTypeId] = None, hasPermanentEstablishment:Option[Boolean] = None, taxId:Option[String] = None, streamlinedSalesTax:Option[Boolean] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, nexusTaxTypeGroup:Option[String] = None, taxAuthorityId:Option[Long] = None, isSellerImporterOfRecord:Option[Boolean] = None) {

  def withId(value:Int):NexusModel = copy(id = Some(value))
  def withCompanyId(value:Int):NexusModel = copy(companyId = Some(value))
  def withCountry(value:String):NexusModel = copy(country = Some(value))
  def withRegion(value:String):NexusModel = copy(region = Some(value))
  def withJurisTypeId(value:JurisTypeId):NexusModel = copy(jurisTypeId = Some(value))
  def withJurisdictionTypeId(value:JurisdictionType):NexusModel = copy(jurisdictionTypeId = Some(value))
  def withJurisCode(value:String):NexusModel = copy(jurisCode = Some(value))
  def withJurisName(value:String):NexusModel = copy(jurisName = Some(value))
  def withEffectiveDate(value:Date):NexusModel = copy(effectiveDate = Some(value))
  def withEndDate(value:Date):NexusModel = copy(endDate = Some(value))
  def withShortName(value:String):NexusModel = copy(shortName = Some(value))
  def withSignatureCode(value:String):NexusModel = copy(signatureCode = Some(value))
  def withStateAssignedNo(value:String):NexusModel = copy(stateAssignedNo = Some(value))
  def withNexusTypeId(value:NexusTypeId):NexusModel = copy(nexusTypeId = Some(value))
  def withSourcing(value:Sourcing):NexusModel = copy(sourcing = Some(value))
  def withHasLocalNexus(value:Boolean):NexusModel = copy(hasLocalNexus = Some(value))
  def withLocalNexusTypeId(value:LocalNexusTypeId):NexusModel = copy(localNexusTypeId = Some(value))
  def withHasPermanentEstablishment(value:Boolean):NexusModel = copy(hasPermanentEstablishment = Some(value))
  def withTaxId(value:String):NexusModel = copy(taxId = Some(value))
  def withStreamlinedSalesTax(value:Boolean):NexusModel = copy(streamlinedSalesTax = Some(value))
  def withCreatedDate(value:Date):NexusModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):NexusModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):NexusModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):NexusModel = copy(modifiedUserId = Some(value))
  def withNexusTaxTypeGroup(value:String):NexusModel = copy(nexusTaxTypeGroup = Some(value))
  def withTaxAuthorityId(value:Long):NexusModel = copy(taxAuthorityId = Some(value))
  def withIsSellerImporterOfRecord(value:Boolean):NexusModel = copy(isSellerImporterOfRecord = Some(value))
}
  
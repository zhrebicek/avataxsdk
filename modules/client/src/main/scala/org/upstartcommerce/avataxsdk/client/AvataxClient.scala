package org.upstartcommerce.avataxsdk.client

import java.text.{DateFormat, SimpleDateFormat}

import akka.actor.ActorSystem
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client.internal._

import scala.concurrent.Future
import HttpMethods._
import akka.NotUsed
import akka.http.scaladsl.model.headers
import akka.http.scaladsl.model.headers._
import akka.http.scaladsl.unmarshalling.{Unmarshal, Unmarshaller}
import akka.stream.scaladsl.Source
import org.upstartcommerce.avataxsdk.core.data._
import org.upstartcommerce.avataxsdk.core.data.models._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._
import org.upstartcommerce.avataxsdk.core.data.enums._
import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._

// todo: remove date for more usable one
// todo: swap strings for enums
// todo: remove .toStrings (from enums etc.)
// todo: non-generic include as Set()
// todo: typed orderBy
// todo: group by apis
// todo: check verify's, they return err
trait AvataxClient {
  def accountResetLicenseKey(id: Int,
                             model: ResetLicenseKeyModel): AvataxSimpleCall[LicenseKeyModel]

  def activateAccount(id: Int, model: ActivateAccountModel): AvataxSimpleCall[AccountModel]
  def auditAccount(id:Int, start:Date, end:Date, options: BasicQueryOptions): AvataxCollectionCall[AuditModel]
  def getAccount(id:Int, include:Include):AvataxSimpleCall[AccountModel] = ???
  def getAccountConfiguration(id:Int):AvataxSimpleCall[AccountConfigurationModel] = ???
  def queryAccounts(include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[AccountConfigurationModel] = ???
  def setAccountConfiguration(id:Int, model:List[AccountConfigurationModel]):AvataxSimpleCall[List[AccountConfigurationModel]] = ???
  def resolveAddress(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String, textCase:String):AvataxSimpleCall[AddressResolutionModel] = ???
  def resolveAddressPost(model:AddressValidationInfo):AvataxSimpleCall[AddressResolutionModel] = ???
  def approveAdvancedRuleScript(accountId:Int, scriptType:AdvancedRuleScriptModel):AvataxSimpleCall[AdvancedRuleScriptModel] = ???
  def createAdvancedRuleScript(accountId:Int, scriptType:AdvancedRuleScriptModel, crashBehavior: AdvancedRuleCrashBehavior):AvataxSimpleCall[String] = ???
  def createAdvancedRuleTable(accountId:Int, csvTableName:String, file:String):AvataxSimpleCall[String] = ???
  def deleteAdvancedRuleScript(accountId:Int, scriptType:AdvancedRuleScriptType):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteAdvancedRuleTable(accountId:Int, csvTableName:String):AvataxSimpleCall[List[ErrorDetail]] = ???
  def disableAdvancedRuleScript(accountId:Int, scriptType:AdvancedRuleScriptType):AvataxSimpleCall[AdvancedRuleScriptModel] = ???
  def enableAdvancedRuleScript(accountId:Int, scriptType:AdvancedRuleScriptType):AvataxSimpleCall[AdvancedRuleScriptModel] = ???
  def getAdvancedRuleScript(accountId:Int, scriptType:AdvancedRuleScriptType):AvataxSimpleCall[AdvancedRuleScriptModel] = ???
  def getAdvancedRuleTable(accountId:Int, csvTableName:String):AvataxSimpleCall[AdvancedRuleTableModel] = ???
  def getAdvancedRuleTables(accountId:Int):AvataxSimpleCall[AdvancedRuleTableModel] = ???
  def unapproveAdvancedRuleScript(accountId:Int, scriptType:AdvancedRuleScriptType):AvataxSimpleCall[AdvancedRuleScriptModel] = ???
  def createAvaFileForms(model:List[AvaFileFormModel]):AvataxSimpleCall[List[AvaFileFormModel]] = ???
  def deleteAvaFileForm(id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getAvaFileForm(id:Int):AvataxSimpleCall[AvaFileFormModel] = ???
  def queryAvaFileForms(include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[AccountConfigurationModel] = ???
  def updateAvaFileForm(id:Int, model:AvaFileFormModel):AvataxSimpleCall[AvaFileFormModel] = ???
  def createBatches(companyId:Int, model:List[BatchModel]):AvataxSimpleCall[BatchModel] = ???
  def deleteBatch(companyId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def downloadBatch(companyId:Int, batchId:Int, id:Int):AvataxSimpleCall[String] = ???
  def getBatch(companyId:Int, id:Int):AvataxSimpleCall[BatchModel] = ???
  def listBatchesByCompany(companyId:Int, include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[BatchModel] = ???
  def queryBatches(include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[BatchModel] = ???
  def createCertExpressInvitation(companyId:Int, customerCode:String, model:CreateCertExpressInvitationModel):AvataxSimpleCall[List[CertExpressInvitationModel]] = ???
  def getCertExpressInvitationModel(companyId:Int, customerCode:String, id:Int, include:Include):AvataxSimpleCall[CertExpressInvitationModel] = ???
  def listCertExpressInvitations(companyId:Int, include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[CertExpressInvitationModel] = ???
  def createCertificates(companyId:Int, preValidatedExemptionReason:Boolean, model:List[CertificateModel]):AvataxSimpleCall[List[CertificateModel]] = ???
  def deleteCertificate(companyId:Int, id:Int):AvataxSimpleCall[CertificateModel] = ???
  def downloadCertificateImage(companyId:Int, id:Int, page:Int, `type`:CertificatePreviewType):AvataxSimpleCall[String] = ???
  def getCertificate(companyId:Int, id:Int, include:Include):AvataxSimpleCall[CertificateModel] = ???
  def getCertificateSetup(companyId:Int):AvataxSimpleCall[ProvisionStatusModel] = ???
  def linkAttributesToCertificate(companyId:Int, id:Int, model:List[CertificateAttributeModel]):AvataxCollectionCall[CertificateAttributeModel] = ???
  def linkCustomersToCertificate(companyId:Int, id:Int, model:List[LinkCustomersModel]):AvataxCollectionCall[CustomerModel] = ???
  def listAttributesForCertificate(companyId:Int, id:Int):AvataxCollectionCall[CertificateAttributeModel] = ???
  def listCustomersForCertificate(companyId:Int, id:Int, include:Include):AvataxCollectionCall[CustomerModel] = ???
  def queryCertificates(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CustomerModel] = ???
  def requestCertificateSetup(companyId:Int):AvataxSimpleCall[ProvisionStatusModel] = ???
  def unlinkAttributesFromCertificate(companyId:Int, id:Int, model:List[CertificateAttributeModel]):AvataxCollectionCall[CustomerModel] = ???
  def unlinkCustomersFromCertificate(companyId:Int, id:Int, model:LinkCustomersModel):AvataxCollectionCall[CustomerModel] = ???
  def updateCertificate(companyId:Int, id:Int, model:CertificateModel):AvataxSimpleCall[CertificateModel] = ???
  def uploadCertificateImage(companyId:Int, id:Int, file:String):AvataxSimpleCall[String] = ???
  def changeFilingStatus(id:Int, model:FilingStatusChangeModel):AvataxSimpleCall[String] = ???
  def companyInitialize(model:CompanyInitializationModel):AvataxSimpleCall[CompanyModel] = ???
  def createCompanies(model:List[CompanyModel]):AvataxSimpleCall[List[CompanyModel]] = ???
  def createFundingRequest(id:Int, model:FundingInitiateModel):AvataxSimpleCall[FundingStatusModel] = ???
  def deleteCompany(id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def fundingConfigurationByCompany(companyId:Int):AvataxSimpleCall[FundingConfigurationModel] = ???
  def fundingConfigurationsByCompanyAndCurrrency(companyId:Int, currency:String):AvataxSimpleCall[List[FundingConfigurationModel]] = ???
  def getCompany(id:Int, include:Include):AvataxSimpleCall[CompanyModel] = ???
  def getCompanyConfiguration(id:Int):AvataxSimpleCall[List[CompanyConfigurationModel]] = ???
  def getFilingStatus(id:Int):AvataxSimpleCall[String] = ???
  def listFundingRequestsByCompany(id:Int):AvataxSimpleCall[List[FundingConfigurationModel]] = ???
  def listMrsCompanies():AvataxCollectionCall[FundingConfigurationModel] = ???
  def queryCompanies(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CompanyModel] = ???
  def setCompanyConfiguration(id:Int, model:List[CompanyConfigurationModel]):AvataxSimpleCall[List[CompanyConfigurationModel]] = ???
  def updateCompany(id:Int, model:CompanyModel):AvataxSimpleCall[CompanyModel] = ???
  def createContacts(companyId:Int, model:List[ContactModel]):AvataxSimpleCall[List[ContactModel]] = ???
  def deleteContact(companyId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getContact(companyId:Int, id:Int):AvataxSimpleCall[ContactModel] = ???
  def listContactsByCompany(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CompanyModel] = ???
  def queryContacts(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CompanyModel] = ???
  def updateContact(companyId:Int, id:Int, model:ContactModel):AvataxSimpleCall[ContactModel] = ???
  def createCustomers(companyId:Int, model:List[CustomerModel]):AvataxSimpleCall[List[CustomerModel]] = ???
  def deleteCustomer(companyId:Int, customerCode:String):AvataxSimpleCall[CustomerModel] = ???
  def getCustomer(companyId:Int, customerCode:String, include:Include):AvataxSimpleCall[CustomerModel] = ???
  def linkCertificatesToCustomer(companyId:Int, customerCode:String, model:LinkCertificatesModel):AvataxCollectionCall[CertificateModel] = ???
  def linkShipToCustomersToBillCustomer(companyId:Int, code:String, model:LinkCustomersModel):AvataxSimpleCall[CustomerModel] = ???
  def listCertificatesForCustomer(companyId:Int, customerCode:String, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CertificateModel] = ???
  def listValidCertificatesForCustomer(companyId:Int, customerCode:String, country:String, region:String):AvataxSimpleCall[ExemptionStatusModel] = ???
  def queryCustomers(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CustomerModel] = ???
  def unlinkCertificatesFromCustomer(companyId:Int, customerCode:String, model:LinkCertificatesModel):AvataxCollectionCall[CertificateModel] = ???
  def updateCustomer(companyId:Int, customerCode:String, model:CustomerModel):AvataxSimpleCall[ContactModel] = ???
  def createDataSources(companyId:Int, model:List[DataSourceModel]):AvataxSimpleCall[List[DataSourceModel]] = ???
  def deleteDataSource(companyId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getDataSourceById(companyId:Int, id:Int):AvataxSimpleCall[DataSourceModel] = ???
  def listDataSources(companyId:Int, options:FiltrableQueryOptions):AvataxCollectionCall[DataSourceModel] = ???
  def queryDataSources(options:FiltrableQueryOptions):AvataxCollectionCall[DataSourceModel] = ???
  def updateDataSource(companyId:Int, id:Int, model:DataSourceModel):AvataxSimpleCall[DataSourceModel] = ???
  def getCrossBorderCode(country:String, hsCode:String):AvataxCollectionCall[HsCodeModel] = ???
  def getLoginVerifierByForm(form:String, options:FiltrableQueryOptions):AvataxCollectionCall[SkyscraperStatusModel] = ???
  def listAvaFileForms(options:FiltrableQueryOptions):AvataxCollectionCall[AvaFileFormModel] = ???
  def listCertificateAttributes(options:FiltrableQueryOptions):AvataxCollectionCall[LinkCertificatesModel] = ???
  def listCertificateExemptReasons(options:FiltrableQueryOptions):AvataxCollectionCall[ExemptionReasonModel] = ???
  def listCertificatesExposureZones(options:FiltrableQueryOptions):AvataxCollectionCall[ExposureZoneModel] = ???
  def listCommunicationsServiceTypes(id:Int, options:FiltrableQueryOptions):AvataxCollectionCall[CommunicationsTSPairModel] = ???
  def listCommunicationsTransactionTypes(options:FiltrableQueryOptions):AvataxCollectionCall[CommunicationsTransactionTypeModel] = ???
  def listCommunicationsTSPairs(options:FiltrableQueryOptions):AvataxCollectionCall[CommunicationsTSPairModel] = ???
  def listCountries(options:FiltrableQueryOptions):AvataxCollectionCall[IsoCountryModel] = ???
  def listCoverLetters(options:FiltrableQueryOptions):AvataxCollectionCall[CoverLetterModel] = ???
  def listCrossBorderCodes(country:String, hsCode:String, options:FiltrableQueryOptions):AvataxCollectionCall[HsCodeModel] = ???
  def listCrossBorderSections():AvataxCollectionCall[HsCodeModel] = ???
  def listCurrencies(options: FiltrableQueryOptions): AvataxCollectionCall[CurrencyModel]
  def listEntityUseCodes(options:FiltrableQueryOptions):AvataxCollectionCall[EntityUseCodeModel] = ???
  def listFilingFrequencies(options:FiltrableQueryOptions):AvataxCollectionCall[FilingFrequencyModel] = ???
  def listJurisdictions(options:FiltrableQueryOptions):AvataxCollectionCall[JurisdictionModel] = ???
  def listJurisdictionsByAddress(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String, options:FiltrableQueryOptions):AvataxCollectionCall[JurisdictionOverrideModel] = ???
  def listLocationQuestionsByAddress(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String, latitude:BigDecimal, longitude:BigDecimal, options:FiltrableQueryOptions):AvataxCollectionCall[LocationQuestionModel] = ???
  def listLoginVerifiers(options: FiltrableQueryOptions): AvataxCollectionCall[SkyscraperStatusModel] = ???
  def listNexus(options: FiltrableQueryOptions): AvataxCollectionCall[NexusModel] = ???
  def listNexusByAddress(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String, options:FiltrableQueryOptions):AvataxCollectionCall[NexusModel] = ???
  def listNexusByCountry(country:String, options:FiltrableQueryOptions):AvataxCollectionCall[NexusModel] = ???
  def listNexusByCountryAndRegion(country:String, region:String, options:FiltrableQueryOptions):AvataxCollectionCall[NexusModel] = ???
  def listNexusByFormCode(formCode:String, options:FiltrableQueryOptions):AvataxCollectionCall[NexusModel] = ???
  def listNexusTaxTypeGroups(options:FiltrableQueryOptions):AvataxCollectionCall[NexusTaxTypeGroupModel] = ???
  def listNoticeCustomerFundingOptions(options:FiltrableQueryOptions):AvataxCollectionCall[NoticeCustomerFundingOptionModel] = ???
  def listNoticeCustomerTypes(options:FiltrableQueryOptions):AvataxCollectionCall[NoticeCustomerTypeModel] = ???
  def listNoticeFilingTypes(options:FiltrableQueryOptions):AvataxCollectionCall[NoticeFilingTypeModel] = ???
  def listNoticePriorities(options:FiltrableQueryOptions):AvataxCollectionCall[NoticePriorityModel] = ???
  def listNoticeReasons(options:FiltrableQueryOptions):AvataxCollectionCall[NoticeReasonModel] = ???
  def listNoticeResponsibilities(options:FiltrableQueryOptions):AvataxCollectionCall[NoticeResponsibilityModel] = ???
  def listNoticeRootCauses(options:FiltrableQueryOptions):AvataxCollectionCall[NoticeRootCauseModel] = ???
  def listNoticeStatuses(options:FiltrableQueryOptions):AvataxCollectionCall[NoticeStatusModel] = ???
  def listNoticeTypes(options:FiltrableQueryOptions):AvataxCollectionCall[NoticeTypeModel] = ???
  def listParameters(options:FiltrableQueryOptions):AvataxCollectionCall[ParameterModel] = ???
  def listParametersByItem(companyCode:String, itemCode:String, options:FiltrableQueryOptions):AvataxCollectionCall[ParameterModel] = ???
  def listPermissions(options:BasicQueryOptions):AvataxCollectionCall[String] = ???
  def listPostalCodes(options:FiltrableQueryOptions):AvataxCollectionCall[PostalCodeModel] = ???
  def listPreferredPrograms(options:FiltrableQueryOptions):AvataxCollectionCall[PreferredProgramModel] = ???
  def listProductClassificationSystems(options:FiltrableQueryOptions):AvataxCollectionCall[ProductClassificationSystemModel] = ???
  def listProductClassificationSystemsByCompany(companyCode:String, options:FiltrableQueryOptions):AvataxCollectionCall[ProductClassificationSystemModel] = ???
  def listRateTypesByCountry(country:String, options:FiltrableQueryOptions):AvataxCollectionCall[RateTypeModel] = ???
  def listRegions(options:FiltrableQueryOptions):AvataxCollectionCall[IsoRegionModel] = ???
  def listRegionsByCountry(country:String, options:FiltrableQueryOptions):AvataxCollectionCall[IsoRegionModel] = ???
  def listResourceFileTypes(options:FiltrableQueryOptions):AvataxCollectionCall[ResourceFileTypeModel] = ???
  def listSecurityRoles(options:FiltrableQueryOptions):AvataxCollectionCall[SecurityRoleModel] = ???
  def listSubscriptionTypes(options:FiltrableQueryOptions):AvataxCollectionCall[SubscriptionTypeModel] = ???
  def listTaxAuthorities(options:FiltrableQueryOptions):AvataxCollectionCall[TaxAuthorityModel] = ???
  def listTaxAuthorityForms(options:FiltrableQueryOptions):AvataxCollectionCall[TaxAuthorityFormModel] = ???
  def listTaxAuthorityTypes(options:FiltrableQueryOptions):AvataxCollectionCall[TaxAuthorityTypeModel] = ???
  def listTaxCodes(options:FiltrableQueryOptions):AvataxCollectionCall[TaxCodeModel] = ???
  def listTaxCodeTypes(options:FiltrableQueryOptions):AvataxCollectionCall[TaxCodeTypesModel] = ???
  def listTaxForms(options:FiltrableQueryOptions):AvataxCollectionCall[FormMasterModel] = ???
  def listTaxSubTypes(options:FiltrableQueryOptions):AvataxCollectionCall[TaxSubTypeModel] = ???
  def listTaxTypeGroups(options:FiltrableQueryOptions):AvataxCollectionCall[TaxTypeGroupModel] = ???
  def listUnitOfMeasurement(options:FiltrableQueryOptions):AvataxCollectionCall[UomModel] = ???
  def createDistanceThreshold(companyId:Int, model:List[CompanyDistanceThresholdModel]):AvataxSimpleCall[List[CompanyDistanceThresholdModel]] = ???
  def deleteDistanceThreshold(companyId:Int, id:Long):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getDistanceThreshold(companyId:Int, id:Long):AvataxSimpleCall[CompanyDistanceThresholdModel] = ???
  def listDistanceThresholds(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CompanyDistanceThresholdModel] = ???
  def queryDistanceThresholds(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[CompanyDistanceThresholdModel] = ???
  def updateDistanceThreshold(companyId:Int, id:Long, model:CompanyDistanceThresholdModel):AvataxSimpleCall[CompanyDistanceThresholdModel] = ???
  def approveFilingRequest(companyId:Int, id:Long):AvataxSimpleCall[FilingRequestModel] = ???
  def cancelFilingRequest(companyId:Int, id:Long):AvataxSimpleCall[FilingRequestModel] = ???
  def cancelFilingRequests(companyId:Int, id:Long, model:List[FilingRequestModel]):AvataxSimpleCall[FilingRequestModel] = ???
  def createFilingCalendars(companyId:Int, model:List[FilingCalendarModel]):AvataxSimpleCall[FilingCalendarModel] = ???
  def createFilingRequests(companyId:Int, model:List[FilingRequestModel]):AvataxSimpleCall[FilingRequestModel] = ???
  def cycleSafeAdd(companyId:Int, formCode:String):AvataxSimpleCall[List[CycleAddOptionModel]] = ???
  def cycleSafeEdit(companyId:Int, formCode:String, model:List[FilingCalendarEditModel]):AvataxSimpleCall[CycleEditOptionModel] = ???
  def cycleSafeExpiration(companyId:Int, id:Int):AvataxSimpleCall[CycleExpireModel] = ???
  def deleteFilingCalendar(companyId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getFilingCalendar(companyId:Int, id:Int):AvataxSimpleCall[FilingCalendarModel] = ???
  def getFilingRequest(companyId:Int, id:Int):AvataxSimpleCall[FilingRequestModel] = ???
  def listFilingCalendars(companyId:Int, returnCountry:String, returnRegion:String, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[FilingCalendarModel] = ???
  def listFilingRequests(companyId:Int, filingCalendarId:Int, options:FiltrableQueryOptions):AvataxCollectionCall[FilingRequestModel] = ???
  def loginVerificationRequest(model:LoginVerificationInputModel):AvataxSimpleCall[LoginVerificationOutputModel] = ???
  def loginVerificationStatus(jobId:Int):AvataxSimpleCall[LoginVerificationOutputModel] = ???
  def queryFilingCalendars(returnCountry:String, returnRegion:String, options:FiltrableQueryOptions):AvataxCollectionCall[FilingCalendarModel] = ???
  def queryFilingRequests(filingCalendarId:Int, returnCountry:String, returnRegion:String, options:FiltrableQueryOptions):AvataxCollectionCall[FilingRequestModel] = ???
  def requestFilingCalendarUpdate(companyId:Int, id:Int, model:List[FilingRequestModel]):AvataxSimpleCall[FilingRequestModel] = ???
  def updateFilingCalendar(companyId:Int, id:Int, model:FilingCalendarModel):AvataxSimpleCall[FilingCalendarModel] = ???
  def updateFilingRequest(companyId:Int, id:Int, model:FilingRequestModel):AvataxSimpleCall[FilingRequestModel] = ???
  def approveFilings(companyId:Int, year:Short, month:Byte, model:ApproveFilingsModel):AvataxSimpleCall[List[FilingModel]] = ???
  def approveFilingsCountry(companyId:Int, year:Short, month:Byte, country:String, model:ApproveFilingsModel):AvataxSimpleCall[List[FilingModel]] = ???
  def approveFilingsCountryRegion(companyId:Int, year:Short, month:Byte, country:String, region:String, model:ApproveFilingsModel):AvataxSimpleCall[List[FilingModel]] = ???
  def createReturnAdjustment(companyId:Int, year:Short, month:Byte, country:String, region:String, formCode:String, model:List[FilingAdjustmentModel]):AvataxSimpleCall[List[FilingAdjustmentModel]] = ???
  def createReturnAugmentation(companyId:Int, year:Short, month:Byte, country:String, region:String, formCode:String, model:List[FilingAugmentationModel]):AvataxSimpleCall[List[FilingAugmentationModel]] = ???
  def createReturnPayment(companyId:Int, year:Short, month:Byte, country:String, region:String, formCode:String, model:List[FilingPaymentModel]):AvataxSimpleCall[List[FilingPaymentModel]] = ???
  def deleteReturnAdjustment(companyId:Int, id:Long):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteReturnAugmentation(companyId:Int, id:Long):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteReturnPayment(companyId:Int, id:Long):AvataxSimpleCall[List[ErrorDetail]] = ???
  def filingCheckupReport(companyId:Int, filingsId:Int):AvataxSimpleCall[FilingsCheckupModel] = ???
  def filingCheckupReports(companyId:Int, year:Short, month:Byte):AvataxSimpleCall[FilingsCheckupModel] = ???
  def getFilingsAttachment(companyId:Int, filingReturnId:Long, fileId:Long):AvataxSimpleCall[String] = ???
  def getFilingsAttachments(companyId:Int, year:Short, month:Byte):AvataxSimpleCall[String] = ???
  def getFilingsAttachmentsTraceFile(companyId:Int, year:Short, month:Byte):AvataxSimpleCall[String] = ???
  def getFilingReturn(companyId:Int, id:Int, details:Boolean):AvataxSimpleCall[FilingReturnModel] = ???
  def getFilings(companyId:Int, year:Short, month:Byte):AvataxCollectionCall[FilingModel] = ???
  def getFilingsByCountry(companyId:Int, year:Short, month:Byte, country:String):AvataxCollectionCall[FilingModel] = ???
  def getFilingsByCountryRegion(companyId:Int, year:Short, month:Byte, country:String, region:String):AvataxCollectionCall[FilingModel] = ???
  def getFilingsByReturnName(companyId:Int, year:Short, month:Byte, country:String, region:String, formCode:String):AvataxCollectionCall[FilingModel] = ???
  def getFilingReturns(companyId:Int, endPeriodMonth:Int, endPeriodYear:Int, frequency:FilingFrequencyId, status:FilingStatusId, country:String, region:String, filingCalendarId:Long):AvataxSimpleCall[FilingReturnModelBasic] = ???
  def rebuildFilings(companyId:Int, year:Short, month:Byte, model:RebuildFilingsModel):AvataxCollectionCall[RebuildFilingsModel] = ???
  def rebuildFilingsByCountry(companyId:Int, year:Short, month:Byte, country:String, model:RebuildFilingsModel):AvataxCollectionCall[RebuildFilingsModel] = ???
  def rebuildFilingsByCountryRegion(companyId:Int, year:Short, month:Byte, country:String, region:String, model:RebuildFilingsModel):AvataxCollectionCall[RebuildFilingsModel] = ???
  def updateReturnAdjustment(companyId:Int, id:Long, model:FilingAdjustmentModel):AvataxSimpleCall[FilingAdjustmentModel] = ???
  def updateReturnAugmentation(companyId:Int, id:Long, model:FilingAugmentationModel):AvataxSimpleCall[FilingAugmentationModel] = ???
  def updateReturnPayment(companyId:Int, id:Long, model:FilingPaymentModel):AvataxSimpleCall[FilingPaymentModel] = ???
  def requestFreeTrial(model:FreeTrialRequestModel):AvataxSimpleCall[NewAccountModel] = ???
  def taxRatesByAddress(line1:String, line2:String, line3:String, city:String, region:String, postalCode:String, country:String):AvataxSimpleCall[TaxRateModel] = ???
  def taxRatesByPostalCode(country:String, postalCode:String):AvataxSimpleCall[TaxRateModel] = ???
  def activateFundingRequest(id: Long): AvataxSimpleCall[FundingStatusModel]
  def fundingRequestStatus(id: Long): AvataxSimpleCall[FundingStatusModel]
  def createItemClassifications(companyId:Int, itemId:Long, model:List[ItemClassificationInputModel]):AvataxSimpleCall[List[ItemClassificationOutputModel]] = ???
  def createItemParameters(companyId:Int, itemId:Long, model:List[ItemParameterModel]):AvataxSimpleCall[List[ItemParameterModel]] = ???
  def createItems(companyId:Int, model:List[ItemModel]):AvataxSimpleCall[List[ItemModel]] = ???
  def deleteItem(companyId:Int, id:Long):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteItemClassification(companyId:Int, itemId:Long, id:Long):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteItemParameter(companyId:Int, itemId:Long, id:Long):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getItem(companyId:Int, itemId:Long, include:Include):AvataxSimpleCall[ItemModel] = ???
  def getItemClassification(companyId:Int, itemId:Long, id:Long):AvataxSimpleCall[ItemClassificationOutputModel] = ???
  def getItemParameter(companyId:Int, itemId:Long, id:Long):AvataxSimpleCall[ItemParameterModel] = ???
  def listItemClassifications(companyId:Int, itemId:Long, options:FiltrableQueryOptions):AvataxCollectionCall[ItemParameterModel] = ???
  def listItemParameters(companyId:Int, itemId:Long, options:FiltrableQueryOptions):AvataxCollectionCall[ItemParameterModel] = ???
  def listItemsByCompany(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[ItemModel] = ???
  def queryItems(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[ItemModel] = ???
  def updateItem(companyId:Int, id:Long, model:ItemModel):AvataxSimpleCall[ItemModel] = ???
  def updateItemClassification(companyId:Int, itemId:Long, id:Long, model:ItemClassificationInputModel):AvataxSimpleCall[ItemClassificationOutputModel] = ???
  def updateItemParameter(companyId:Int, itemId:Long, id:Long, model:ItemParameterModel):AvataxSimpleCall[ItemParameterModel] = ???
  def createJurisdictionOverrides(accountId:Int, model:List[JurisdictionOverrideModel]):AvataxSimpleCall[List[JurisdictionOverrideModel]] = ???
  def deleteJurisdictionOverride(accountId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getJurisdictionOverridesByAccount(accountId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[JurisdictionOverrideModel] = ???
  def queryJurisdictionOverrides(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[JurisdictionOverrideModel] = ???
  def updateJurisdictionOverrides(accountId:Int, id:Int, model:JurisdictionOverrideModel):AvataxSimpleCall[JurisdictionOverrideModel] = ???
  def createLocations(companyId:Int, model:List[LocationModel]):AvataxSimpleCall[List[LocationModel]] = ???
  def deleteLocation(companyId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getLocation(companyId:Int, id:Int, include:Include):AvataxSimpleCall[LocationModel] = ???
  def listLocationsByCompany(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[LocationModel] = ???
  def queryLocations(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[LocationModel] = ???
  def updateLocation(companyId:Int, id:Int, model:LocationModel):AvataxSimpleCall[LocationModel] = ???
  def validateLocation(companyId:Int, id:Int):AvataxSimpleCall[LocationValidationModel] = ???
  def adjustMultiDocumentTransaction(code:String, `type`:DocumentType, include:Include, model:AdjustMultiDocumentModel):AvataxSimpleCall[MultiDocumentModel] = ???
  def auditMultiDocumentTransaction(code:String, `type`:DocumentType):AvataxSimpleCall[AuditMultiDocumentModel] = ???
  def commitMultiDocumentTransaction(model:CommitMultiDocumentModel):AvataxSimpleCall[MultiDocumentModel] = ???
  def createMultiDocumentTransaction(include:Include, model:CreateMultiDocumentModel):AvataxSimpleCall[MultiDocumentModel] = ???
  def getMultiDocumentTransactionByCodeAndType(code:String, `type`:DocumentType, include:Include):AvataxSimpleCall[MultiDocumentModel] = ???
  def getMultiDocumentTransactionById(id:Long, include:Include):AvataxSimpleCall[MultiDocumentModel] = ???
  def listMultiDocumentTransactions(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[MultiDocumentModel] = ???
  def refundMultiDocumentTransaction(code:String, `type`:DocumentType, include:Include, model:RefundTransactionModel):AvataxSimpleCall[MultiDocumentModel] = ???
  def verifyMultiDocumentTransaction(model:VerifyMultiDocumentModel):AvataxSimpleCall[MultiDocumentModel] = ???
  def voidMultiDocumentTransaction(code:String, `type`:DocumentType, model:VoidTransactionModel):AvataxSimpleCall[MultiDocumentModel] = ???
  def createNexus(companyId:Int, model:List[NexusModel]):AvataxSimpleCall[List[NexusModel]] = ???
  def declareNexusByAddress(companyId:Int, model:List[DeclareNexusByAddressModel]):AvataxSimpleCall[List[NexusByAddressModel]] = ???
  def deleteNexus(companyId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getNexus(companyId:Int, id:Int):AvataxSimpleCall[NexusModel] = ???
  def getNexusByFormCode(companyId:Int, formCode:String):AvataxSimpleCall[NexusByTaxFormModel] = ???
  def listNexusByCompany(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[NexusModel] = ???
  def queryNexus(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[NexusModel] = ???
  def updateNexus(companyId:Int, id:Int, model:NexusModel):AvataxSimpleCall[NexusModel] = ???
  def createNoticeComment(companyId:Int, id:Int, model:List[NoticeCommentModel]):AvataxSimpleCall[List[NoticeCommentModel]] = ???
  def createNoticeFinanceDetails(companyId:Int, id:Int, model:List[NoticeFinanceModel]):AvataxSimpleCall[List[NoticeFinanceModel]] = ???
  def createNoticeResponsibilities(companyId:Int, id:Int, model:List[NoticeResponsibilityDetailModel]):AvataxSimpleCall[List[NoticeResponsibilityDetailModel]] = ???
  def createNoticeRootCauses(companyId:Int, id:Int, model:List[NoticeRootCauseDetailModel]):AvataxSimpleCall[List[NoticeRootCauseDetailModel]] = ???
  def createNotices(companyId:Int, model:List[NoticeModel]):AvataxSimpleCall[List[NoticeModel]] = ???
  def deleteCommentDetails(companyId:Int, id:Int, commentDetailsId:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteFinanceDetails(companyId:Int, id:Int, financeDetailsId:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteNotice(companyId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteResponsibilities(companyId:Int, noticeId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteRootCauses(companyId:Int, noticeId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def downloadNoticeAttachment(companyId:Int, id:Long):AvataxSimpleCall[String] = ???
  def getNotice(companyId:Int, id:Int):AvataxSimpleCall[NoticeModel] = ???
  def getNoticeComments(companyId:Int, id:Int):AvataxSimpleCall[NoticeCommentModel] = ???
  def getNoticeFinanceDetails(companyId:Int, id:Int):AvataxCollectionCall[NoticeFinanceModel] = ???
  def getNoticeResponsibilities(companyId:Int, id:Int):AvataxCollectionCall[NoticeResponsibilityDetailModel] = ???
  def getNoticeRootCauses(companyId:Int, id:Int):AvataxCollectionCall[NoticeRootCauseDetailModel] = ???
  def listNoticesByCompany(companyId:Int, include:Include, options:QueryOptions):AvataxCollectionCall[NoticeModel] = ???
  def queryNotices(include:Include, options:QueryOptions):AvataxCollectionCall[NoticeModel] = ???
  def updateFinanceDetails(companyId:Int, id:Int, financeDetailsId:Int, model:NoticeFinanceModel):AvataxSimpleCall[NoticeFinanceModel] = ???
  def updateNoticeModel(companyId:Int, id:Int, model:NoticeModel):AvataxSimpleCall[NoticeModel] = ???
  def updateNoticeComments(companyId:Int, id:Int, commentDetailsId:Int, model:NoticeCommentModel):AvataxSimpleCall[NoticeCommentModel] = ???
  def uploadAttachment(companyId:Int, model:ResourceFileUploadRequestModel):AvataxSimpleCall[String] = ???
  def dismissNotification(id:Long):AvataxSimpleCall[NotificationModel] = ???
  def getNotification(id:Long):AvataxSimpleCall[NotificationModel] = ???
  def listNotifications(options:FiltrableQueryOptions):AvataxCollectionCall[NotificationModel] = ???
  def requestNewAccount(model:NewAccountRequestModel):AvataxSimpleCall[NewAccountModel] = ???
  def requestNewEntitlement(id:Int, offer:String):AvataxSimpleCall[OfferModel] = ???
  def createAccount(model:AccountModel):AvataxSimpleCall[List[AccountModel]] = ???
  def createNotifications(model:List[NotificationModel]):AvataxSimpleCall[List[NotificationModel]] = ???
  def createSubscriptions(accountId:Int, model:List[SubscriptionModel]):AvataxSimpleCall[List[SubscriptionModel]] = ???
  def deleteAccount(accountId:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteNotification(notificationId:Long):AvataxSimpleCall[List[ErrorDetail]] = ???
  def deleteSubscription(accountId:Int, subscriptionId:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def resetPassword(userId:Int, unmigrateFromAi:Boolean, model:SetPasswordModel):AvataxSimpleCall[String] = ???
  def updateAccount(id:Int, model:AccountModel):AvataxSimpleCall[String] = ???
  def updateNotification(id:Long, model:NotificationModel):AvataxSimpleCall[NotificationModel] = ???
  def updateSubscription(accountId:Int, id:Int, model:SubscriptionModel):AvataxSimpleCall[SubscriptionModel] = ???
  def downloadReport(id:Long):AvataxSimpleCall[String] = ???
  def exportDocumentLine(companyId:Int, model:ExportDocumentLineModel):AvataxSimpleCall[String] = ???
  def getReport(id:Long):AvataxSimpleCall[ReportModel] = ???
  def initiateExportDocumentLineReport(companyId:Int, model:ExportDocumentLineModel):AvataxSimpleCall[List[ReportModel]] = ???
  def listReports():AvataxCollectionCall[ReportModel] = ???
  def createSettings(companyId:Int, model:List[SettingModel]):AvataxSimpleCall[List[SettingModel]] = ???
  def deleteSettings(companyId:Int, id:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getSettings(companyId:Int, id:Int):AvataxSimpleCall[SettingModel] = ???
  def listSettingsByCompany(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[SettingModel] = ???
  def querySettings(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[SettingModel] = ???
  def updateSettings(companyId:Int, id:Int, model:SettingModel):AvataxSimpleCall[SettingModel] = ???
  def getSubscription(companyId:Int, id:Int):AvataxSimpleCall[SubscriptionModel] = ???
  def listSubscriptionsByAccount(accountId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[SubscriptionModel] = ???
  def querySubscriptions(options:FiltrableQueryOptions):AvataxCollectionCall[SubscriptionModel] = ???
  def createTaxCodes(companyId:Int, model:List[TaxCodeModel]):AvataxSimpleCall[List[TaxCodeModel]] = ???
  def deleteTaxCode(companyId:Int, taxCodeId:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getTaxCode(companyId:Int, taxCodeId:Int):AvataxSimpleCall[TaxCodeModel] = ???
  def listTaxCodesByCompany(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[TaxCodeModel] = ???
  def queryTaxCodes(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[TaxCodeModel] = ???
  def updateTaxCode(companyId:Int, taxCodeId:Int, model:TaxCodeModel):AvataxSimpleCall[TaxCodeModel] = ???
  def buildTaxContentFile(model:PointOfSaleDataRequestModel):AvataxSimpleCall[String] = ???
  def buildTaxContentForLocation(companyId:Int, id:Int, date:Date, format:PointOfSaleFileType, partner:PointOfSalePartnerId, includeJurisCodes:Boolean):AvataxSimpleCall[String] = ???
  def downloadTaxRatesByZipCodes(date:Date, region:String):AvataxSimpleCall[String] = ???
  def createTaxRules(companyId:Int, model:List[TaxRuleModel]):AvataxSimpleCall[List[TaxRuleModel]] = ???
  def deleteTaxRule(companyId:Int, taxRuleId:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getTaxRule(companyId:Int, taxRuleId:Int):AvataxSimpleCall[TaxRuleModel] = ???
  def listTaxRules(companyId:Int, include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[TaxRuleModel] = ???
  def queryTaxRules(include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[TaxRuleModel] = ???
  def updateTaxRule(companyId:Int, taxRuleId:Int, model:TaxRuleModel):AvataxSimpleCall[TaxRuleModel] = ???
  def addLines(include:Include, model:AddTransactionLineModel):AvataxSimpleCall[TransactionModel] = ???
  def adjustTransaction(companyCode:String, transactionCode:String, documentType:DocumentType, model:AdjustTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def auditTransaction(companyCode:String, transactionCode:String):AvataxSimpleCall[AuditTransactionModel] = ???
  def auditTransactionWithType(companyCode:String, transactionCode:String, documentType:DocumentType):AvataxSimpleCall[AuditTransactionModel] = ???
  def bulkLockTransaction(model:BulkLockTransactionModel):AvataxSimpleCall[BulkLockTransactionResult] = ???
  def changeTransactionCode(companyCode:String, transactionCode:String, documentType:DocumentType, model:ChangeTransactionCodeModel):AvataxSimpleCall[TransactionModel] = ???
  def commitTransaction(companyCode:String, transactionCode:String, documentType:DocumentType, model:CommitTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def createOrAdjustTransaction(include:Include, model:CreateOrAdjustTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def createTransaction(include:Include, model:CreateTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def deleteLines(include:Include, model:RemoveTransactionLineModel):AvataxSimpleCall[TransactionModel] = ???
  def getTransactionByCode(companyCode:String, transactionCode:String, documentType:DocumentType, include:Include):AvataxSimpleCall[TransactionModel] = ???
  def getTransactionByCodeAndType(companyCode:String, transactionCode:String, documentType:DocumentType, include:Include):AvataxSimpleCall[TransactionModel] = ???
  def getTransactionById(id:Long, include:Include):AvataxSimpleCall[TransactionModel] = ???
  def listTransactionsByCompany(companyCode:String, include:Include, options: FiltrableQueryOptions):AvataxCollectionCall[TransactionModel] = ???
  def lockTransaction(companyCode:String, transactionCode:String, documentType:DocumentType, model:LockTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def refundTransaction(companyCode:String, transactionCode:String, documentType:DocumentType, include:Include, useTaxDateOverride:Boolean, model:RefundTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def settleTransaction(companyCode:String, transactionCode:String, documentType:DocumentType, model:SettleTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def uncommitTransaction(companyCode:String, transactionCode:String, documentType:DocumentType):AvataxSimpleCall[TransactionModel] = ???
  def verifyTransaction(companyCode:String, transactionCode:String, documentType:DocumentType, model:VerifyTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def voidTransaction(companyCode:String, transactionCode:String, documentType:DocumentType, model:VoidTransactionModel):AvataxSimpleCall[TransactionModel] = ???
  def createUPCs(companyId:Int, model:List[UPCModel]):AvataxSimpleCall[List[UPCModel]] = ???
  def deleteUPCs(companyId:Int, upcId:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getUPC(companyId:Int, upcId:Int):AvataxSimpleCall[UPCModel] = ???
  def listUPCsByCompany(companyId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[UPCModel] = ???
  def queryUPCs(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[UPCModel] = ???
  def updateUPC(companyId:Int, upcId:Int, model:UPCModel):AvataxSimpleCall[UPCModel] = ???
  def changePassword(model:PasswordChangeModel):AvataxSimpleCall[String] = ???
  def createUsers(accountId:Int, model:List[UserModel]):AvataxSimpleCall[List[UserModel]] = ???
  def deleteUser(accountId:Int, userId:Int):AvataxSimpleCall[List[ErrorDetail]] = ???
  def getUser(accountId:Int, userId:Int, include:Include):AvataxSimpleCall[UserModel] = ???
  def getUserEntitlements(accountId:Int, userId:Int):AvataxSimpleCall[UserEntitlementModel] = ???
  def listUsersByAccount(accountId:Int, include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[UserModel] = ???
  def queryUsers(include:Include, options:FiltrableQueryOptions):AvataxCollectionCall[UserModel] = ???
  def updateUser(accountId:Int, userId:Int, model:UserModel):AvataxSimpleCall[UserModel] = ???
  def getMySubscription(serviceTypeId:ServiceTypeId):AvataxSimpleCall[SubscriptionModel] = ???
  def listMySubscriptions():AvataxCollectionCall[SubscriptionModel] = ???
  def ping():AvataxSimpleCall[PingResultModel] = ???
}

sealed trait AvataxCall[+A]

/**
  * Simple calls are ones that return pure model, and have no possibility of pagination, offset...,
  * and thus streaming makes little sense
  */
sealed trait AvataxSimpleCall[A] extends AvataxCall[A] {
  def apply(): Future[A]
}

/**
  * Enables both batch and streamed calls.
  *
  * Avatax imposes limit on how many resources it can return in one call, and thus it's
  * up to client to split/limit/offset/paginate the requests should one need more than limit.
  * For such cases one can use `stream` method, which does the pagination automatically (based
  * on query options, same as with `Future` methods).
  */
sealed trait AvataxCollectionCall[A] extends AvataxCall[A] {
  def batch(): Future[FetchResult[A]]
  final def apply(): Future[FetchResult[A]] = batch()
  def stream: Source[A, NotUsed]
}

object AvataxClient {
  def apply(base64header: String)(implicit system: ActorSystem,
                                  materializer: ActorMaterializer): AvataxClient = {

    val poolFlow    = HostPool.forUrl("sandbox-rest.avatax.com")
    val requester   = Requester.pooled(poolFlow, 10)

    val credentials = headers.Authorization(GenericHttpCredentials("Basic", base64header))
    val dateFmt  = {
      new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
    }

    import system.dispatcher

    /**
      * Fetches data based on request
      */
    def fetch[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, A]): Future[A] = {
      val resp = requester.request(req)
      resp.flatMap { x =>
        Unmarshal(x).to[A]
      }
    }

    /**
      * Fetches one batch of data based on request
      */
    def batchFetch[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): Future[FetchResult[A]] =
      fetch[FetchResult[A]](req)

    /**
      * Pulls the data continously from source, following next link in resultset each time.
      */
    def continuousStream[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): Source[A, NotUsed] = {
      Source
        .unfoldAsync[Option[HttpRequest], List[A]](Some(req)) {
          case Some(url) =>
            batchFetch[A](url)
              .map {
                case FetchResult(_, values, Some(next)) => Some((Some(url.withUri(next)), values))
                case FetchResult(_, values, None)       => Some((None, values))
              }
          case None => Future.successful(None)
        }
        .flatMapConcat(xs => Source(xs))
    }

    def avataxCollectionCall[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): AvataxCollectionCall[A] =
      new AvataxCollectionCall[A] {
        def batch(): Future[FetchResult[A]] = batchFetch[A](req)
        def stream: Source[A, NotUsed]      = continuousStream[A](req)
      }

    def avataxSimpleCall[A: Format](req: HttpRequest)(
        implicit um: Unmarshaller[HttpResponse, FetchResult[A]]): AvataxSimpleCall[A] =
      new AvataxSimpleCall[A] {
        def apply(): Future[A] = fetch[A](req)
      }

    new AvataxClient {
      def accountResetLicenseKey(id: Int,
                                 model: ResetLicenseKeyModel): AvataxSimpleCall[LicenseKeyModel] = {
        val uri = Uri(s"/api/v2/accounts/$id/resetlicensekey")
        val req = HttpRequest(uri = uri).withMethod(POST).withHeaders(credentials)
        avataxSimpleCall[LicenseKeyModel](req)
      }

      def activateAccount(id: Int, model: ActivateAccountModel): AvataxSimpleCall[AccountModel] = {
        val uri = Uri(s"/api/v2/accounts/$id/activate")
        val req = HttpRequest(uri = uri).withMethod(POST).withHeaders(credentials)
        avataxSimpleCall[AccountModel](req)
      }

      def auditAccount(id:Int, start:Date, end:Date, options: BasicQueryOptions): AvataxCollectionCall[AuditModel] = {
        val uri = Uri(s"/api/v2/accounts/$id/audit").withQuery(options.asQuery.and("start", dateFmt.format(start)).and("end", dateFmt.format(end)))
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentials)
        avataxCollectionCall[AuditModel](req)
      }

      //
      def activateFundingRequest(id: Long): AvataxSimpleCall[FundingStatusModel] = {
        val uri = Uri(s"/api/v2/fundingrequests/$id/widget")
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentials)
        avataxSimpleCall[FundingStatusModel](req)
      }

      def fundingRequestStatus(id: Long): AvataxSimpleCall[FundingStatusModel] = {
        val uri = Uri(s"/api/v2/fundingrequests/$id")
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentials)
        avataxSimpleCall[FundingStatusModel](req)
      }


      def listCurrencies(options: FiltrableQueryOptions): AvataxCollectionCall[CurrencyModel] = {
        val uri = Uri("/api/v2/definitions/currencies").withQuery(options.asQuery)
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentials)
        avataxCollectionCall[CurrencyModel](req)
      }
    }
  }
}

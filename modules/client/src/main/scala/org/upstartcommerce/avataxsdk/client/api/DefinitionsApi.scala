package org.upstartcommerce.avataxsdk.client.api

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

trait DefinitionsApi {
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
}

object DefinitionsApi {
  def apply(requester:Requester, credentialsHeader:HttpHeader)(implicit system: ActorSystem,
                                  materializer: ActorMaterializer): DefinitionsApi =
    new ApiRoot(requester, credentialsHeader) with DefinitionsApi {
      def listCurrencies(options: FiltrableQueryOptions): AvataxCollectionCall[CurrencyModel] = {
        val uri = Uri("/api/v2/definitions/currencies").withQuery(options.asQuery)
        val req = HttpRequest(uri = uri).withMethod(GET).withHeaders(credentialsHeader)
        avataxCollectionCall[CurrencyModel](req)
      }
    }
}

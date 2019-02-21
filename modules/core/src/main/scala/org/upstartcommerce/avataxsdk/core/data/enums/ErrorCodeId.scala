/* Copyright 2019 UpStart Commerce, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait ErrorCodeId
object ErrorCodeId {
  case object ServerConfiguration                          extends ErrorCodeId
  case object AccountInvalidException                      extends ErrorCodeId
  case object CompanyInvalidException                      extends ErrorCodeId
  case object EntityNotFoundError                          extends ErrorCodeId
  case object ValueRequiredError                           extends ErrorCodeId
  case object RangeError                                   extends ErrorCodeId
  case object RangeCompareError                            extends ErrorCodeId
  case object RangeSetError                                extends ErrorCodeId
  case object TaxpayerNumberRequired                       extends ErrorCodeId
  case object EntityLimitExceeded                          extends ErrorCodeId
  case object CommonPassword                               extends ErrorCodeId
  case object WeakPassword                                 extends ErrorCodeId
  case object StringLengthError                            extends ErrorCodeId
  case object MaxStringLengthError                         extends ErrorCodeId
  case object EmailValidationError                         extends ErrorCodeId
  case object EmailMissingError                            extends ErrorCodeId
  case object ParserFieldNameError                         extends ErrorCodeId
  case object ParserFieldValueError                        extends ErrorCodeId
  case object ParserSyntaxError                            extends ErrorCodeId
  case object ParserTooManyParametersError                 extends ErrorCodeId
  case object ParserUnterminatedValueError                 extends ErrorCodeId
  case object DeleteUserSelfError                          extends ErrorCodeId
  case object OldPasswordInvalid                           extends ErrorCodeId
  case object CannotChangePassword                         extends ErrorCodeId
  case object DateFormatError                              extends ErrorCodeId
  case object NoDefaultCompany                             extends ErrorCodeId
  case object AuthenticationException                      extends ErrorCodeId
  case object AuthorizationException                       extends ErrorCodeId
  case object ValidationException                          extends ErrorCodeId
  case object InactiveUserError                            extends ErrorCodeId
  case object AuthenticationIncomplete                     extends ErrorCodeId
  case object BasicAuthIncorrect                           extends ErrorCodeId
  case object IdentityServerError                          extends ErrorCodeId
  case object BearerTokenInvalid                           extends ErrorCodeId
  case object ModelRequiredException                       extends ErrorCodeId
  case object AccountExpiredException                      extends ErrorCodeId
  case object VisibilityError                              extends ErrorCodeId
  case object BearerTokenNotSupported                      extends ErrorCodeId
  case object InvalidSecurityRole                          extends ErrorCodeId
  case object InvalidRegistrarAction                       extends ErrorCodeId
  case object RemoteServerError                            extends ErrorCodeId
  case object NoFilterCriteriaException                    extends ErrorCodeId
  case object OpenClauseException                          extends ErrorCodeId
  case object JsonFormatError                              extends ErrorCodeId
  case object InvalidDecimalValue                          extends ErrorCodeId
  case object UnhandledException                           extends ErrorCodeId
  case object ReportingCompanyMustHaveContactsError        extends ErrorCodeId
  case object CompanyProfileNotSet                         extends ErrorCodeId
  case object CannotAssignUserToCompany                    extends ErrorCodeId
  case object MustAssignUserToCompany                      extends ErrorCodeId
  case object ModelStateInvalid                            extends ErrorCodeId
  case object DateRangeError                               extends ErrorCodeId
  case object InvalidDateRangeError                        extends ErrorCodeId
  case object RuleMustHaveTaxCode                          extends ErrorCodeId
  case object RuleTypeRestricted                           extends ErrorCodeId
  case object AllJurisRuleLimits                           extends ErrorCodeId
  case object InvalidCompanyLocationSetting                extends ErrorCodeId
  case object InvalidAdjustmentType                        extends ErrorCodeId
  case object DeleteInformation                            extends ErrorCodeId
  case object OutOfRange                                   extends ErrorCodeId
  case object UnspecifiedTimeZone                          extends ErrorCodeId
  case object CannotCreateDeletedObjects                   extends ErrorCodeId
  case object CannotModifyDeletedObjects                   extends ErrorCodeId
  case object ReturnNameNotFound                           extends ErrorCodeId
  case object InvalidAddressTypeAndCategory                extends ErrorCodeId
  case object DefaultCompanyLocation                       extends ErrorCodeId
  case object InvalidCountry                               extends ErrorCodeId
  case object InvalidCountryRegion                         extends ErrorCodeId
  case object BrazilValidationError                        extends ErrorCodeId
  case object BrazilExemptValidationError                  extends ErrorCodeId
  case object BrazilPisCofinsError                         extends ErrorCodeId
  case object JurisdictionNotFoundError                    extends ErrorCodeId
  case object MedicalExciseError                           extends ErrorCodeId
  case object RateDependsTaxabilityError                   extends ErrorCodeId
  case object RateDependsEuropeError                       extends ErrorCodeId
  case object InvalidRateTypeCode                          extends ErrorCodeId
  case object RateTypeNotSupported                         extends ErrorCodeId
  case object CannotUpdateNestedObjects                    extends ErrorCodeId
  case object UPCCodeInvalidChars                          extends ErrorCodeId
  case object UPCCodeInvalidLength                         extends ErrorCodeId
  case object IncorrectPathError                           extends ErrorCodeId
  case object InvalidJurisdictionType                      extends ErrorCodeId
  case object MustConfirmResetLicenseKey                   extends ErrorCodeId
  case object DuplicateCompanyCode                         extends ErrorCodeId
  case object TINFormatError                               extends ErrorCodeId
  case object DuplicateNexusError                          extends ErrorCodeId
  case object UnknownNexusError                            extends ErrorCodeId
  case object ParentNexusNotFound                          extends ErrorCodeId
  case object InvalidTaxCodeType                           extends ErrorCodeId
  case object CannotActivateCompany                        extends ErrorCodeId
  case object DuplicateEntityProperty                      extends ErrorCodeId
  case object ReportingEntityError                         extends ErrorCodeId
  case object InvalidReturnOperationError                  extends ErrorCodeId
  case object CannotDeleteCompany                          extends ErrorCodeId
  case object CountryOverridesNotAvailable                 extends ErrorCodeId
  case object JurisdictionOverrideMismatch                 extends ErrorCodeId
  case object DuplicateSystemTaxCode                       extends ErrorCodeId
  case object SSTOverridesNotAvailable                     extends ErrorCodeId
  case object NexusDateMismatch                            extends ErrorCodeId
  case object NexusParentDateMismatch                      extends ErrorCodeId
  case object BearerTokenParseUserIdError                  extends ErrorCodeId
  case object RetrieveUserError                            extends ErrorCodeId
  case object InvalidConfigurationSetting                  extends ErrorCodeId
  case object InvalidConfigurationValue                    extends ErrorCodeId
  case object InvalidEnumValue                             extends ErrorCodeId
  case object TaxCodeAssociatedTaxRule                     extends ErrorCodeId
  case object CannotSwitchAccountId                        extends ErrorCodeId
  case object RequestIncomplete                            extends ErrorCodeId
  case object AccountNotNew                                extends ErrorCodeId
  case object PasswordLengthInvalid                        extends ErrorCodeId
  case object LocalNexusConflict                           extends ErrorCodeId
  case object InvalidEcmsOverrideCode                      extends ErrorCodeId
  case object AccountDoesNotExist                          extends ErrorCodeId
  case object InvalidTaxType                               extends ErrorCodeId
  case object IncorrectFieldValue                          extends ErrorCodeId
  case object LeadingOrTrailingException                   extends ErrorCodeId
  case object NotEnoughAddressesInfo                       extends ErrorCodeId
  case object ReportNotInitiated                           extends ErrorCodeId
  case object FailedToBuildReport                          extends ErrorCodeId
  case object ReportNotFinished                            extends ErrorCodeId
  case object FailedToDownloadReport                       extends ErrorCodeId
  case object MalformedFilterException                     extends ErrorCodeId
  case object ExpectedConjunctionError                     extends ErrorCodeId
  case object CriteriaNotSupportedError                    extends ErrorCodeId
  case object CompanyAccountAndParentAccountMismatch       extends ErrorCodeId
  case object InvalidFileContentType                       extends ErrorCodeId
  case object RequestTooLarge                              extends ErrorCodeId
  case object EcmsDisabled                                 extends ErrorCodeId
  case object UnknownConjunctionError                      extends ErrorCodeId
  case object NoLinesDiscounted                            extends ErrorCodeId
  case object FailedToDelete                               extends ErrorCodeId
  case object CircularCompanyHierarchies                   extends ErrorCodeId
  case object DuplicateEntry                               extends ErrorCodeId
  case object DuplicateFieldNameInOrderBy                  extends ErrorCodeId
  case object CannotAdjustDocumentType                     extends ErrorCodeId
  case object UserNoAccess                                 extends ErrorCodeId
  case object InvalidEntry                                 extends ErrorCodeId
  case object TransactionAlreadyCancelled                  extends ErrorCodeId
  case object QueryParameterOutOfRange                     extends ErrorCodeId
  case object BatchSalesAuditMustBeZippedError             extends ErrorCodeId
  case object BatchZipMustContainOneFileError              extends ErrorCodeId
  case object BatchInvalidFileTypeError                    extends ErrorCodeId
  case object BatchCannotSaveBatchFile                     extends ErrorCodeId
  case object BatchCannotGetBatchFile                      extends ErrorCodeId
  case object BatchCannotDeleteBatchFile                   extends ErrorCodeId
  case object BatchMustContainOneFile                      extends ErrorCodeId
  case object MissingBatchFileContent                      extends ErrorCodeId
  case object PointOfSaleFileSize                          extends ErrorCodeId
  case object PointOfSaleSetup                             extends ErrorCodeId
  case object InvalidInputDate                             extends ErrorCodeId
  case object GetTaxError                                  extends ErrorCodeId
  case object AddressConflictException                     extends ErrorCodeId
  case object DocumentCodeConflict                         extends ErrorCodeId
  case object MissingAddress                               extends ErrorCodeId
  case object InvalidParameterValue                        extends ErrorCodeId
  case object DocumentFetchLimit                           extends ErrorCodeId
  case object InvalidAddress                               extends ErrorCodeId
  case object AddressLocationNotFound                      extends ErrorCodeId
  case object MissingLine                                  extends ErrorCodeId
  case object InvalidAddressTextCase                       extends ErrorCodeId
  case object DocumentNotCommitted                         extends ErrorCodeId
  case object InvalidDocumentTypesToFetch                  extends ErrorCodeId
  case object TimeoutRequested                             extends ErrorCodeId
  case object InvalidPostalCode                            extends ErrorCodeId
  case object InvalidSubscriptionDescription               extends ErrorCodeId
  case object InvalidSubscriptionTypeId                    extends ErrorCodeId
  case object CannotChangeFilingStatus                     extends ErrorCodeId
  case object ServerUnreachable                            extends ErrorCodeId
  case object SubscriptionRequired                         extends ErrorCodeId
  case object AccountExists                                extends ErrorCodeId
  case object InvitationOnly                               extends ErrorCodeId
  case object FreeTrialNotAvailable                        extends ErrorCodeId
  case object AccountExistsDifferentEmail                  extends ErrorCodeId
  case object AvalaraIdentityApiError                      extends ErrorCodeId
  case object InvalidIPAddress                             extends ErrorCodeId
  case object OfferCodeAlreadyApplied                      extends ErrorCodeId
  case object InvalidDocumentStatusForRefund               extends ErrorCodeId
  case object RefundTypeAndPercentageMismatch              extends ErrorCodeId
  case object InvalidDocumentTypeForRefund                 extends ErrorCodeId
  case object RefundTypeAndLineMismatch                    extends ErrorCodeId
  case object RefundLinesRequired                          extends ErrorCodeId
  case object InvalidRefundType                            extends ErrorCodeId
  case object RefundPercentageOutOfRange                   extends ErrorCodeId
  case object RefundPercentageMissing                      extends ErrorCodeId
  case object MustUseCreateTransaction                     extends ErrorCodeId
  case object MustAcceptTermsAndConditions                 extends ErrorCodeId
  case object FilingCalendarCannotBeDeleted                extends ErrorCodeId
  case object InvalidEffectiveDate                         extends ErrorCodeId
  case object NonOutletForm                                extends ErrorCodeId
  case object OverlappingFilingCalendar                    extends ErrorCodeId
  case object CannotModifyLockedTransaction                extends ErrorCodeId
  case object LineAlreadyExists                            extends ErrorCodeId
  case object LineDoesNotExist                             extends ErrorCodeId
  case object LinesNotSpecified                            extends ErrorCodeId
  case object LineDetailsDoesNotExist                      extends ErrorCodeId
  case object CannotCreateTransactionWithDeletedDataSource extends ErrorCodeId
  case object InvalidBusinessType                          extends ErrorCodeId
  case object CannotModifyExemptCert                       extends ErrorCodeId
  case object CertificatesError                            extends ErrorCodeId
  case object MissingRequiredFields                        extends ErrorCodeId
  case object CertificatesNotSetup                         extends ErrorCodeId
  case object AddRelationshipsError                        extends ErrorCodeId
  case object MissingExposureZone                          extends ErrorCodeId
  case object ConflictingExposureZone                      extends ErrorCodeId
  case object MissingFieldToCreateExposureZone             extends ErrorCodeId
  case object MissingExemptReason                          extends ErrorCodeId
  case object InvalidExemptReason                          extends ErrorCodeId
  case object InvalidExemptionOperation                    extends ErrorCodeId
  case object ConflictingFields                            extends ErrorCodeId
  case object InvalidPdfOrImageFile                        extends ErrorCodeId
  case object InvalidCoverLetterTitle                      extends ErrorCodeId
  case object AccountNotProvisioned                        extends ErrorCodeId
  case object InvalidRequestContentType                    extends ErrorCodeId
  case object ExemptionPaginationLimits                    extends ErrorCodeId
  case object ExemptionSortLimits                          extends ErrorCodeId
  case object CustomerCantBeBothShipToAndBillTo            extends ErrorCodeId
  case object BillToCustomerExpected                       extends ErrorCodeId
  case object ShipToCustomerExpected                       extends ErrorCodeId
  case object TransactionNotCancelled                      extends ErrorCodeId
  case object TooManyTransactions                          extends ErrorCodeId
  case object OnlyTaxDateOverrideIsAllowed                 extends ErrorCodeId
  case object TransactionAlreadyExists                     extends ErrorCodeId
  case object DateMismatch                                 extends ErrorCodeId
  case object InvalidDocumentStatusForVerify               extends ErrorCodeId
  case object TotalAmountMismatch                          extends ErrorCodeId
  case object TotalTaxMismatch                             extends ErrorCodeId
  case object InvalidDocumentStatusForCommit               extends ErrorCodeId
  case object InvalidDocumentType                          extends ErrorCodeId
  case object MultiDocumentPartiallyLocked                 extends ErrorCodeId
  case object TransactionIsCommitted                       extends ErrorCodeId
  case object CommsConfigClientIdMissing                   extends ErrorCodeId
  case object CommsConfigClientIdBadValue                  extends ErrorCodeId
  case object AccountInNewStatusException                  extends ErrorCodeId
  case object WorksheetException                           extends ErrorCodeId
  case object InvalidAccountOverride                       extends ErrorCodeId
  case object AccountOverrideNotAuthorized                 extends ErrorCodeId
  case object ParserFieldNotQueryableError                 extends ErrorCodeId
  case object UsernameRequired                             extends ErrorCodeId
  case object InvalidAuditMessage                          extends ErrorCodeId
  case object CannotDeleteParentBeforeChildNexus           extends ErrorCodeId
  case object NexusChildDateMismatch                       extends ErrorCodeId
  case object RemoteValidationError                        extends ErrorCodeId
  case object AdvancedRuleBadScript                        extends ErrorCodeId
  case object AdvancedRuleBadCsvTable                      extends ErrorCodeId
  case object AdvancedRuleRequestRuleError                 extends ErrorCodeId
  case object AdvancedRuleResponseRuleError                extends ErrorCodeId
  case object AdvancedRuleNotApproved                      extends ErrorCodeId
  case object InvalidDocumentStatusToAddOrDeleteLines      extends ErrorCodeId
  case object TaxRuleRequiresNexus                         extends ErrorCodeId
  case object UPCCodeNotUnique                             extends ErrorCodeId
  case object CannotUpdateSourceOrInstance                 extends ErrorCodeId
  case object TaxCodeAssociatedWithItemCodeNotFound        extends ErrorCodeId
  case object DuplicateSystemForItem                       extends ErrorCodeId
  case object UnsupportedFileFormat                        extends ErrorCodeId
  case object UnsupportedOutputFileType                    extends ErrorCodeId
  case object TaxProfileNotProvided                        extends ErrorCodeId
  case object InvalidTaxProfile                            extends ErrorCodeId
  case object CompanyTaxProfileEntryRequired               extends ErrorCodeId
  case object ErrorReadingTaxProfileEntry                  extends ErrorCodeId
  case object TraceDataNotAvailable                        extends ErrorCodeId
  case object InvalidParameterUnitMeasurementType          extends ErrorCodeId
  case object ParameterUnitRequired                        extends ErrorCodeId
  case object InvalidParameterValueDataType                extends ErrorCodeId
  case object InvalidParameterAttributeType                extends ErrorCodeId
  case object SubscriptionRequiredForParameter             extends ErrorCodeId
}
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

package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FreeTrialRequestModel(firstName:Option[String] = None, lastName:Option[String] = None, email:Option[String] = None, company:Option[String] = None, phone:Option[String] = None, campaign:Option[String] = None, companyAddress:Option[CompanyAddress] = None, website:Option[String] = None, haveReadAvalaraTermsAndConditions:Option[Boolean] = None, acceptAvalaraTermsAndConditions:Option[Boolean] = None) {

  def withFirstName(value:String):FreeTrialRequestModel = copy(firstName = Some(value))
  def withLastName(value:String):FreeTrialRequestModel = copy(lastName = Some(value))
  def withEmail(value:String):FreeTrialRequestModel = copy(email = Some(value))
  def withCompany(value:String):FreeTrialRequestModel = copy(company = Some(value))
  def withPhone(value:String):FreeTrialRequestModel = copy(phone = Some(value))
  def withCampaign(value:String):FreeTrialRequestModel = copy(campaign = Some(value))
  def withCompanyAddress(value:CompanyAddress):FreeTrialRequestModel = copy(companyAddress = Some(value))
  def withWebsite(value:String):FreeTrialRequestModel = copy(website = Some(value))
  def withHaveReadAvalaraTermsAndConditions(value:Boolean):FreeTrialRequestModel = copy(haveReadAvalaraTermsAndConditions = Some(value))
  def withAcceptAvalaraTermsAndConditions(value:Boolean):FreeTrialRequestModel = copy(acceptAvalaraTermsAndConditions = Some(value))
}
  
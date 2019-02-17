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

final case class LoginVerificationInputModel(companyId:Option[Int] = None, accountId:Option[Int] = None, region:Option[String] = None, taxFormCode:Option[String] = None, username:Option[String] = None, password:Option[String] = None, additionalOptions:Option[Map[String, String]] = None, bulkRequestId:Option[Int] = None, priority:Option[Int] = None) {
  lazy val additionalOptionsRaw:Map[String, String] = additionalOptions.getOrElse(Map.empty)
  def withCompanyId(value:Int):LoginVerificationInputModel = copy(companyId = Some(value))
  def withAccountId(value:Int):LoginVerificationInputModel = copy(accountId = Some(value))
  def withRegion(value:String):LoginVerificationInputModel = copy(region = Some(value))
  def withTaxFormCode(value:String):LoginVerificationInputModel = copy(taxFormCode = Some(value))
  def withUsername(value:String):LoginVerificationInputModel = copy(username = Some(value))
  def withPassword(value:String):LoginVerificationInputModel = copy(password = Some(value))
  def withAdditionalOptions(value:Map[String, String]):LoginVerificationInputModel = copy(additionalOptions = Some(value))
  def withBulkRequestId(value:Int):LoginVerificationInputModel = copy(bulkRequestId = Some(value))
  def withPriority(value:Int):LoginVerificationInputModel = copy(priority = Some(value))
}
  
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

import java.time.Instant

import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AuditTransactionModel(companyId: Option[Int] = None, reconstructed: Option[ReconstructedApiRequestResponseModel] = None, serverTimestamp: Option[Instant] = None, serverDuration: Option[Instant] = None, apiCallStatus: Option[ApiCallStatus] = None, original: Option[OriginalApiRequestResponseModel] = None) {

  def withCompanyId(value: Int): AuditTransactionModel = copy(companyId = Some(value))

  def withReconstructed(value: ReconstructedApiRequestResponseModel): AuditTransactionModel = copy(reconstructed = Some(value))

  def withServerTimestamp(value: Instant): AuditTransactionModel = copy(serverTimestamp = Some(value))

  def withServerDuration(value: Instant): AuditTransactionModel = copy(serverDuration = Some(value))

  def withApiCallStatus(value: ApiCallStatus): AuditTransactionModel = copy(apiCallStatus = Some(value))

  def withOriginal(value: OriginalApiRequestResponseModel): AuditTransactionModel = copy(original = Some(value))
}
  
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

final case class FilingCalendarEditModel(fieldName:Option[String] = None, questionId:Option[Int] = None, oldValue:Option[Map[String, String]] = None, newValue:Option[Map[String, String]] = None) {
  lazy val oldValueRaw:Map[String, String] = oldValue.getOrElse(Map.empty)
  lazy val newValueRaw:Map[String, String] = newValue.getOrElse(Map.empty)
  def withFieldName(value:String):FilingCalendarEditModel = copy(fieldName = Some(value))
  def withQuestionId(value:Int):FilingCalendarEditModel = copy(questionId = Some(value))
  def withOldValue(value:Map[String, String]):FilingCalendarEditModel = copy(oldValue = Some(value))
  def withNewValue(value:Map[String, String]):FilingCalendarEditModel = copy(newValue = Some(value))
}
  
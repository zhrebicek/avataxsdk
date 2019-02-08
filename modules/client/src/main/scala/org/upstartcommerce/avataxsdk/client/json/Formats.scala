package org.upstartcommerce.avataxsdk.client.json

import org.upstartcommerce.avataxsdk.core.data.models.{AuditEvent, CurrencyModel}
import org.upstartcommerce.avataxsdk.core.data.FetchResult
import play.api.libs.json._
import play.api.libs.functional.syntax._

private[json] trait Formats {
  implicit def recordSetOFormat[A](implicit f: Format[List[A]]): OFormat[FetchResult[A]] = new FetchResultFormat[A]
}


private sealed class FetchResultFormat[A](implicit f: Format[List[A]]) extends OFormat[FetchResult[A]] {
  override def writes(o: FetchResult[A]): JsObject =
    JsObject(
      Seq(
        "@recordsetCount" -> JsNumber(o.recordSetCount),
        "value" -> f.writes(o.value)
      ))

  override def reads(json: JsValue): JsResult[FetchResult[A]] = {
    val value = (json \ "value").validate[List[A]]
    val recordSetCount = (json \ "@recordsetCount").validate[Int]
    recordSetCount.and(value).tupled.map {
      case (v, r) => FetchResult(v, r)
    }
  }
}


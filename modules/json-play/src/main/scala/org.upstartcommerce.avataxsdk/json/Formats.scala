package org.upstartcommerce.avataxsdk.json

import org.upstartcommerce.avataxsdk.core.data.FetchResult
import play.api.libs.json._
import play.api.libs.functional.syntax._

private[json] trait Formats {
  implicit def recordSetOFormat[A](implicit f: Format[List[A]]): OFormat[FetchResult[A]] = new FetchResultFormat[A]
}


private sealed class FetchResultFormat[A](implicit f: Format[List[A]]) extends OFormat[FetchResult[A]] {
  private val rsS = "@recordsetCount"
  private val valueS = "value"
  private val nextLinkS = "@nextLink"

  override def writes(o: FetchResult[A]): JsObject =
    JsObject(
      Seq(
        rsS -> JsNumber(o.recordSetCount),
        valueS -> f.writes(o.value)
      ))

  override def reads(json: JsValue): JsResult[FetchResult[A]] = {
    val value = (json \ valueS).validate[List[A]]
    val recordSetCount = (json \ rsS).validate[Int]
    val nextLink = (json \ nextLinkS).validateOpt[String]
    recordSetCount.and(value).and(nextLink).tupled.map {
      case (v, r, nl) => FetchResult(v, r, nl)
    }
  }
}


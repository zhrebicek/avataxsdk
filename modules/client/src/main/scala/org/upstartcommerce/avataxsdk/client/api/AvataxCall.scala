package org.upstartcommerce.avataxsdk.client.api

import akka.NotUsed
import akka.stream.scaladsl.Source
import org.upstartcommerce.avataxsdk.core.data.FetchResult
import scala.concurrent.Future

trait AvataxCall[+A]

/**
  * Simple calls are ones that return pure model, and have no possibility of pagination, offset...,
  * and thus streaming makes little sense
  */
trait AvataxSimpleCall[A] extends AvataxCall[A] {
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
trait AvataxCollectionCall[A] extends AvataxCall[A] {
  def batch(): Future[FetchResult[A]]
  final def apply(): Future[FetchResult[A]] = batch()
  def stream: Source[A, NotUsed]
}


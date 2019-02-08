package org.upstartcommerce.avataxsdk.client.internal

import akka.actor.ActorSystem
import akka.http.scaladsl.model.{HttpRequest, HttpResponse}
import akka.stream.{Materializer, OverflowStrategy, QueueOfferResult}
import akka.stream.scaladsl.{Keep, Sink, Source}
import org.upstartcommerce.avataxsdk.client.HostPool

import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success}

trait Requester {
  def request(request: HttpRequest): Future[HttpResponse]
}

object Requester {
  def pooled(pool:HostPool, queueSize:Int)(implicit sys:ActorSystem, mat:Materializer): Requester = {
    import sys.dispatcher
    val s = Source
      .queue[(HttpRequest, Promise[HttpResponse])](queueSize, OverflowStrategy.dropNew)
      .via(pool)
      .toMat(Sink.foreach({
        case (Success(resp), p) => p.success(resp)
        case (Failure(e), p) => p.failure(e)
      }))(Keep.left)
      .run()

    new Requester {
      override def request(request: HttpRequest): Future[HttpResponse] = {
        val responsePromise = Promise[HttpResponse]()
        s.offer(request -> responsePromise).flatMap {
          case QueueOfferResult.Enqueued => responsePromise.future
          case QueueOfferResult.Dropped =>
            Future.failed(new RuntimeException("Queue overflowed. Try again later."))
          case QueueOfferResult.Failure(ex) => Future.failed(ex)
          case QueueOfferResult.QueueClosed =>
            Future.failed(
              new RuntimeException(
                "Queue was closed (pool shut down) while running the request. Try again later."))
        }
      }
    }
  }
}

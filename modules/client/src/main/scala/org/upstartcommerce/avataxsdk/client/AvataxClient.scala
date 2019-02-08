package org.upstartcommerce.avataxsdk.client

import akka.actor.ActorSystem
import akka.http.scaladsl.model.{HttpRequest, HttpResponse}
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client.internal.{HostPool, Requester}

import scala.concurrent.Future

trait AvataxClient {

  def random(): Future[HttpResponse]
}

object AvataxClient {
  def apply()(implicit system: ActorSystem, materializer: ActorMaterializer): AvataxClient = {

    val poolFlow  = HostPool.forUrl("akka.io")
    val requester = Requester.pooled(poolFlow, 10)

    new AvataxClient {

      override def random(): Future[HttpResponse] = {
        val req = HttpRequest(uri = "/api/v2/companies")
        requester.request(req)
      }


    }
  }
}

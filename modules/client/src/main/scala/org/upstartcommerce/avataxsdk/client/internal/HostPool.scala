package org.upstartcommerce.avataxsdk.client.internal

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpResponse
import com.typesafe.sslconfig.akka.AkkaSSLConfig
import org.upstartcommerce.avataxsdk.client.HostPool

import scala.concurrent.Promise

object HostPool {

  def forUrl(url:String)(implicit sys:ActorSystem):HostPool = {
    Http().cachedHostConnectionPoolHttps[Promise[HttpResponse]](url)
  }
}

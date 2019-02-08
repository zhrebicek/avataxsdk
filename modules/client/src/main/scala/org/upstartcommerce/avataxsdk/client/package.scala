package org.upstartcommerce.avataxsdk

import akka.http.scaladsl.Http.HostConnectionPool
import akka.http.scaladsl.model.{HttpRequest, HttpResponse}
import akka.stream.scaladsl.Flow

import scala.concurrent.Promise
import scala.util.Try

package object client {
  type HostPool = Flow[(HttpRequest, Promise[HttpResponse]),(Try[HttpResponse], Promise[HttpResponse]), HostConnectionPool]
}

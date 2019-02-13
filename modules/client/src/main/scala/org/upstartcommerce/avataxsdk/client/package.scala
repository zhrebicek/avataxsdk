package org.upstartcommerce.avataxsdk

import akka.http.scaladsl.Http.HostConnectionPool
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model.{HttpRequest, HttpResponse}
import akka.stream.scaladsl.Flow
import org.upstartcommerce.avataxsdk.core.data._

import scala.concurrent.Promise
import scala.util.Try

package object client {
  type HostPool = Flow[(HttpRequest, Promise[HttpResponse]),
                       (Try[HttpResponse], Promise[HttpResponse]),
                       HostConnectionPool]

}

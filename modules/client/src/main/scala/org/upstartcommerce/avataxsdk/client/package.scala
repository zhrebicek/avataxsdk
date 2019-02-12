package org.upstartcommerce.avataxsdk

import akka.http.scaladsl.Http.HostConnectionPool
import akka.http.scaladsl.model.Uri.Query
import akka.http.scaladsl.model.{HttpRequest, HttpResponse}
import akka.stream.scaladsl.Flow
import org.upstartcommerce.avataxsdk.core.data.{FilterAst, QueryOptions}

import scala.concurrent.Promise
import scala.util.Try

package object client {
  type HostPool = Flow[(HttpRequest, Promise[HttpResponse]),(Try[HttpResponse], Promise[HttpResponse]), HostConnectionPool]

  implicit class QueryOptionsExt(private val q: QueryOptions) extends AnyVal {
    def asQuery: Query = {
      val params = q.filter.map(x => "$filter" -> FilterAst.serialize(x)).toList ++
        q.top.map(x => "$top"         -> x.toString).toList ++
        q.skip.map(x => "$skip"       -> x.toString).toList ++
        q.orderBy.map(x => "$orderBy" -> x).toList

      Query(params: _*)
    }
  }
}

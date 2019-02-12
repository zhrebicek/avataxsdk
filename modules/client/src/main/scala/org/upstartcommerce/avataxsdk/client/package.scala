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

  implicit class QueryOptionsExt(private val q: QueryOptions) extends AnyVal {
    def asQuery: Query = {
      val required = q.top.map(x => "$top" -> x.toString).toList ++
        q.skip.map(x => "$skip" -> x.toString).toList

      val further = q match {
        case BasicQueryOptions(_, _) => List.empty
        case FiltrableQueryOptions(filter, _, _, orderBy) =>
          filter.map(x => "$filter" -> FilterAst.serialize(x)).toList ++ orderBy
            .map(x => "$orderBy"    -> x)
            .toList
      }

      val params = required ++ further
      Query(params: _*)
    }
  }

  implicit class QueryExt(private val q: Query) extends AnyVal {

    def and(key: String, value: String): Query = q.+:((key, value))
  }
}

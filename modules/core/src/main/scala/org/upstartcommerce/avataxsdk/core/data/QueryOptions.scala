package org.upstartcommerce.avataxsdk.core.data

final case class QueryOptions(filter: Option[FilterAst] = None,
                              top: Option[Int] = None,
                              skip: Option[Int] = None,
                              orderBy: Option[String] = None) {
  def withFilter(filter: FilterAst): QueryOptions   = copy(filter = Some(filter))
  def withTop(top: Int): QueryOptions            = copy(top = Some(top))
  def withSkip(skip: Int): QueryOptions          = copy(skip = Some(skip))
  def withOrderBy(orderBy: String): QueryOptions = copy(orderBy = Some(orderBy))
}

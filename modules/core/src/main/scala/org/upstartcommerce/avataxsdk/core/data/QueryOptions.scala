package org.upstartcommerce.avataxsdk.core.data

final case class QueryOptions(filter:Option[String] = None, top:Option[Int] = None, skip:Option[Int] = None, orderBy:Option[String] = None) {
  def withFilter(filter:String) = copy(filter = Some(filter))
  def withTop(top:Int) = copy(top = Some(top))
  def withSkip(skip:Int) = copy(skip = Some(skip))
  def withOrderBy(orderBy:String) = copy(orderBy = Some(orderBy))
}



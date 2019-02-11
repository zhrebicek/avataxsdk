package example

import org.upstartcommerce.avataxsdk.core.data.FilterAst.syntax._
import org.upstartcommerce.avataxsdk.core.data.FilterAst._

object FilterUsage extends App {

  val s1 = (field("field1") === literal("bar")).bracket && (field("field2") !== field("field3"))
  println(serialize(s1))

  val s2 = field("taxDate").between(literal("2016-01-01"), literal("2016-02-01")) && field("status") === literal("committed")
  println(serialize(s2))

  val s3 = ((field("country") === literal("US")) and (field("region") === literal("CA")))
    .bracket or (field("contry") === literal("CA")).bracket
  println(serialize(s3))

  val s4 = field("code").startsWith(literal("franchise")).bracket and(field("name") contains literal("Bob's")).bracket
  println(serialize(s4))
}

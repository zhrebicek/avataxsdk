package org.upstartcommerce.avataxsdk.client.core

import com.upstartcommerce.synchrony.client.core.data.enums._
import org.scalatest.{Matchers, WordSpec}
import org.upstartcommerce.avatax.client.common.avataxJsonDerivation._
import org.upstartcommerce.avataxsdk.core.data.enums.AccountStatusId
import org.upstartcommerce.synchrony.client.core.data.enums.AccountStatusId

case class Foo(x:AccountStatusId, y:AccountStatusId)
object Foo {
  implicit val f:Format[Foo] = Json.format[Foo]
}

final class FooBar extends WordSpec with Matchers {

  "foo" should {

    "bar" in {

      val a0:AccountStatusId = AccountStatusId.Inactive
      val a1 = Foo(AccountStatusId.Active, AccountStatusId.Inactive)
      val b0 = Json.toJson(a0)
      val b1 = Json.toJson(a1)
      println(b0)
      println(b1)

      val xs = """{"y":"Active","x":"Inactive"}"""
      println(Json.parse(xs).validate[Foo])
    }
  }

}

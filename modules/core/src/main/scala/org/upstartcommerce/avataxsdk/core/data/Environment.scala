package org.upstartcommerce.avataxsdk.core.data

sealed abstract class Environment(val url: String) extends Product with Serializable

object Environment {
  case object Production                            extends Environment("rest.avatax.com")
  case object Sandbox                               extends Environment("sandbox-rest.avatax.com")
  final case class Custom(override val url: String) extends Environment(url)
}

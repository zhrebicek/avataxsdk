package example

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client.AvataxClient
import org.upstartcommerce.avataxsdk.core.data.QueryOptions

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object Example extends App {

  implicit val sys: ActorSystem       = ActorSystem()
  implicit val mat: ActorMaterializer = ActorMaterializer()

  val auth = System.getenv("AVATAX_BASE64")
  val client = AvataxClient(auth)

  val req1 = client.batching.listCurrencies(QueryOptions().withTop(1))
  val resp1 = Await.result(req1, 30.seconds)
  println(resp1)


  val req2 = client.streaming.listCurrencies(QueryOptions().withTop(5))
  val resp2f = req2.runForeach(x => println(x))
  val resp2 = Await.result(resp2f, 30.seconds)
  println(resp2)

}

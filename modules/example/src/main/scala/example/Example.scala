package example

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client.AvataxClient

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object Example extends App {

  implicit val sys: ActorSystem       = ActorSystem()
  implicit val mat: ActorMaterializer = ActorMaterializer()


  val client = AvataxClient()


}

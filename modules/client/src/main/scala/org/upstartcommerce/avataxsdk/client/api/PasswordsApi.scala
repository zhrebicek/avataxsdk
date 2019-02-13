package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data.models._
import akka.http.scaladsl.model.headers.Authorization

import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

/** /api/v2/passwords */
trait PasswordsRootApi {
  def forId(userId:Int): PasswordsApi

  def change(model:PasswordChangeModel):AvataxSimpleCall[String]
}

object PasswordsRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): PasswordsRootApi =
    new ApiRoot(requester, security) with PasswordsRootApi {
      def forId(userId: Int): PasswordsApi = PasswordsApi(requester, security)(userId)

      def change(model:PasswordChangeModel):AvataxSimpleCall[String] = {
        val uri = Uri(s"/api/v2/passwords")
        val req = HttpRequest(uri = uri).withMethod(PUT)
        avataxBodyCall[PasswordChangeModel, String](req, model)
      }
    }
}

trait PasswordsApi {
  def reset(unmigrateFromAi:Boolean, model:SetPasswordModel):AvataxSimpleCall[String]
}
object PasswordsApi {
  def apply(requester: Requester, security: Option[Authorization])(userId:Int)(implicit system: ActorSystem, materializer: ActorMaterializer): PasswordsApi =
    new ApiRoot(requester, security) with PasswordsApi {
      def reset(unmigrateFromAi:Boolean, model:SetPasswordModel):AvataxSimpleCall[String] = {
        val uri = Uri(s"/api/v2/passwords/$userId/reset")
        val req = HttpRequest(uri = uri).withMethod(POST)
        avataxBodyCall[SetPasswordModel, String](req, model)
      }
    }
}
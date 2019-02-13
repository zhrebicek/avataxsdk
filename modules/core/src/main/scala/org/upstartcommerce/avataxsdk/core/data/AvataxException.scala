package org.upstartcommerce.avataxsdk.core.data

import org.upstartcommerce.avataxsdk.core.data.models.ErrorResult

final case class AvataxException(e:ErrorResult) extends Exception(e.error.flatMap(_.message).getOrElse("unknown"))

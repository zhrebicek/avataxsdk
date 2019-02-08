package org.upstartcommerce.avataxsdk.core.data

final case class FetchResult[A](recordSetCount: Int, value: List[A])

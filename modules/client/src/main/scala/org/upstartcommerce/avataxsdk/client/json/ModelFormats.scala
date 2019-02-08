package org.upstartcommerce.avataxsdk.client.json
import org.upstartcommerce.avataxsdk.core.data.models.{AuditEvent, CurrencyModel}
import play.api.libs.json.{Json, OFormat}

/** defines formats for all models */
private[json] trait ModelFormats {
  implicit val currencyModelOFormat: OFormat[CurrencyModel] = Json.format[CurrencyModel]
  implicit val auditEventOFormat: OFormat[AuditEvent]       = Json.format[AuditEvent]
}


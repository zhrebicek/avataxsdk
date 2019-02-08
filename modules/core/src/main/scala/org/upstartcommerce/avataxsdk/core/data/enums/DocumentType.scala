package org.upstartcommerce.avataxsdk.core.data.enums

sealed trait DocumentType
object DocumentType {
  case object SalesOrder               extends DocumentType
  case object SalesInvoice             extends DocumentType
  case object PurchaseOrder            extends DocumentType
  case object PurchaseInvoice          extends DocumentType
  case object ReturnOrder              extends DocumentType
  case object ReturnInvoice            extends DocumentType
  case object InventoryTransferOrder   extends DocumentType
  case object InventoryTransferInvoice extends DocumentType
  case object ReverseChargeOrder       extends DocumentType
  case object ReverseChargeInvoice     extends DocumentType
  case object Any                      extends DocumentType
}

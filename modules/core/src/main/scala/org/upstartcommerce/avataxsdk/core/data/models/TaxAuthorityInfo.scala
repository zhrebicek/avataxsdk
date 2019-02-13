package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxAuthorityInfo(avalaraId:Option[String] = None, jurisdictionName:Option[String] = None, jurisdictionType:Option[JurisdictionType] = None, signatureCode:Option[String] = None) {

  def withAvalaraId(value:String):TaxAuthorityInfo = copy(avalaraId = Some(value))
  def withJurisdictionName(value:String):TaxAuthorityInfo = copy(jurisdictionName = Some(value))
  def withJurisdictionType(value:JurisdictionType):TaxAuthorityInfo = copy(jurisdictionType = Some(value))
  def withSignatureCode(value:String):TaxAuthorityInfo = copy(signatureCode = Some(value))
}
  
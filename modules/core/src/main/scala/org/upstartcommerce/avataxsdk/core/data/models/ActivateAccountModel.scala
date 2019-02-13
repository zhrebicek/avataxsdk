package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ActivateAccountModel(acceptAvalaraTermsAndConditions:Option[Boolean] = None, haveReadAvalaraTermsAndConditions:Option[Boolean] = None) {

  def withAcceptAvalaraTermsAndConditions(value:Boolean):ActivateAccountModel = copy(acceptAvalaraTermsAndConditions = Some(value))
  def withHaveReadAvalaraTermsAndConditions(value:Boolean):ActivateAccountModel = copy(haveReadAvalaraTermsAndConditions = Some(value))
}
  
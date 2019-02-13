package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CommitMultiDocumentModel(code:Option[String] = None, `type`:Option[DocumentType] = None, commit:Option[Boolean] = None) {

  def withCode(value:String):CommitMultiDocumentModel = copy(code = Some(value))
  def withType(value:DocumentType):CommitMultiDocumentModel = copy(`type` = Some(value))
  def withCommit(value:Boolean):CommitMultiDocumentModel = copy(commit = Some(value))
}
  
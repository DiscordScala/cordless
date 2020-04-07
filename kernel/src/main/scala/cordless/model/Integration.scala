package cordless.model

import java.time.ZonedDateTime
import spire.math.ULong

case class Integration(
  id: ULong,
  name: String,
  tpe: String,
  enabled: Boolean,
  syncing: Boolean,
  roleId: ULong,
  enableEmoticons: Option[Boolean],
  expireBehavior: IntegrationExpireBehavior,
  expireGracePeriod: Int,
  user: User,
  account: IntegrationAccount,
  syncedAt: ZonedDateTime
)

sealed trait IntegrationExpireBehavior
object IntegrationExpireBehavior {
  case object RemoveRole extends IntegrationExpireBehavior
  case object Kick extends IntegrationExpireBehavior
}

case class IntegrationAccount(
  id: ULong,
  name: String
)

case class IntegrationOutbound(
  tpe: String,
  id: ULong
)

case class IntegrationPatch(
  expireBehavior: IntegrationExpireBehavior,
  expireGracePeriod: Int,
  enableEmoticons: Boolean
)

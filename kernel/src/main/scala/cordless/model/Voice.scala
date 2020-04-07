package cordless.model

import spire.math.ULong

case class VoiceRegion(
  id: String,
  name: String,
  vip: Boolean,
  optimal: Boolean,
  deprecated: Boolean,
  custom: Boolean
)

case class VoiceState(
  guildId: Option[ULong],
  channelId: Option[ULong],
  userId: ULong,
  member: Option[Member],
  sessionId: String,
  deaf: Boolean,
  mute: Boolean,
  selfDeaf: Boolean,
  selfMute: Boolean,
  selfStream: Option[Boolean],
  suppress: Boolean
)

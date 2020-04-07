package cordless.model

import java.time.ZonedDateTime
import spire.math.ULong

case class Channel(
  id: ULong,
  tpe: Int,
  guildId: Option[ULong],
  position: Option[Int],
  permissionOverwrites: Option[List[Overwrite]],
  name: Option[String],
  topic: Option[String],
  nsfw: Option[Boolean],
  lastMessageId: Option[ULong],
  bitrate: Option[Int],
  userLimit: Option[Int],
  rateLimitPerUser: Option[Int],
  recipients: Option[List[User]],
  icon: Option[String],
  ownerId: Option[ULong],
  applicationId: Option[ULong],
  parentId: Option[ULong],
  lastPinTimestamp: Option[ZonedDateTime]
)

case class ChannelOutbound(
  name: String,
  tpe: Option[Int] = None,
  topic: Option[String] = None,
  bitrate: Option[Int] = None,
  userLimit: Option[Int] = None,
  rateLimitPerUser: Option[Int] = None,
  position: Int,
  permissionOverwrites: Option[List[Overwrite]] = None,
  parentId: Option[ULong] = None,
  nsfw: Option[Boolean] = None
)

case class Overwrite(
  id: ULong,
  tpe: OverwriteType,
  allow: Int,
  deny: Int
)

sealed trait OverwriteType
object OverwriteType {
  case object Role extends OverwriteType
  case object Member extends OverwriteType
}

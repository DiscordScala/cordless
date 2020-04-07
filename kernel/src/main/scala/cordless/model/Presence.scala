package cordless.model

import java.time.{Instant, ZonedDateTime}
import spire.math.ULong

case class PresenceUpdate(
  user: User,
  roles: List[ULong],
  game: Option[Activity],
  guildId: ULong,
  status: Status,
  activities: List[Activity],
  clientStatus: ClientStatus,
  premiumSince: Option[ZonedDateTime],
  nick: Option[String]
)

case class Activity(
  name: String,
  tpe: ActivityType,
  url: Option[String],
  createdAt: Int,
  timestamps: Option[ActivityTimestamps],
  applicationId: Option[ULong],
  details: Option[String],
  state: Option[String],
  emoji: Option[ActivityEmoji],
  party: Option[ActivityParty],
  assets: Option[ActivityAssets],
  secrets: Option[ActivitySecrets],
  instance: Option[Boolean],
  flags: Option[Int]
)

sealed trait Status
object Status {
  case object Offline extends Status
  case object Dnd extends Status
  case object Idle extends Status
  case object Online extends Status
}

case class ClientStatus(
  desktop: Option[Status],
  mobile: Option[Status],
  web: Option[Status]
)

sealed trait ActivityType
object ActivityType {
  case object Game extends ActivityType
  case object Streaming extends ActivityType
  case object Listening extends ActivityType
  case object Custom extends ActivityType
}

case class ActivityTimestamps(
  start: Option[Instant],
  end: Option[Instant]
)

case class ActivityEmoji(
  name: String,
  id: Option[ULong],
  animated: Option[Boolean]
)

case class ActivityParty(
  id: Option[String],
  size: Option[(Int, Int)]
)

case class ActivityAssets(
  largeImage: Option[String],
  largeText: Option[String],
  smallImage: Option[String],
  smallText: Option[String]
)

case class ActivitySecrets(
  join: Option[String],
  spectate: Option[String],
  matc: Option[String]
)

package cordless.model

import java.time.ZonedDateTime
import spire.math.ULong

case class Member(
  user: User,
  nick: Option[String],
  roles: List[ULong],
  joinedAt: ZonedDateTime,
  premiumSince: Option[ZonedDateTime],
  deaf: Boolean,
  mute: Boolean
)

case class MemberListOutbound(
  limit: Option[Int] = None,
  after: Option[ULong] = None
)

case class MemberOutbound(
  accessToken: String,
  nick: Option[String] = None,
  roles: Option[List[ULong]] = None,
  mute: Option[Boolean] = None,
  deaf: Option[Boolean] = None
)

case class MemberPatch(
  nick: Option[String] = None,
  roles: Option[List[ULong]] = None,
  mute: Option[Boolean] = None,
  deaf: Option[Boolean] = None,
  channelId: Option[ULong] = None
)

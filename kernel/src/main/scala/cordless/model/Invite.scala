package cordless.model

case class Invite(
  code: String,
  guild: Option[Guild],
  channel: Channel,
  inviter: Option[User],
  targetUser: Option[User],
  targetUserType: Option[Int],
  approximatePresenceCount: Option[Int],
  approximateMemberCount: Option[Int]
)

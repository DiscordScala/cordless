package cordless.model

import java.time.ZonedDateTime
import spire.math.ULong

case class Guild(
  id: ULong,
  name: String,
  icon: Option[String],
  splash: Option[String],
  discoverySplash: Option[String],
  owner: Option[Boolean],
  ownerId: Option[ULong],
  permissions: Option[Int],
  region: String,
  afkChannelId: Option[ULong],
  afkTimeout: Int,
  embedEnabled: Option[Boolean],
  embedChannelId: Option[ULong],
  verificationLevel: VerificationLevel,
  defaultMessageNotifications: MessageNotificationLevel,
  explicitContentFilter: ExplicitContentFilterLevel,
  roles: List[Role],
  emojis: List[Emoji],
  features: List[GuildFeature],
  mfaLevel: MfaLevel,
  applicationId: Option[ULong],
  widgetEnabled: Option[Boolean],
  widgetChannelId: Option[ULong],
  systemChannelId: Option[ULong],
  systemChannelFlags: Int,
  rulesChannelId: Option[ULong],
  joinedAt: Option[ZonedDateTime],
  large: Option[Boolean],
  unavailable: Option[Boolean],
  memberCount: Option[Int],
  voiceStates: Option[List[VoiceState]],
  members: Option[List[Member]],
  channels: Option[List[Channel]],
  presences: Option[List[PresenceUpdate]],
  maxPresences: Option[Int],
  maxMembers: Option[Int],
  vanityUrlCode: Option[String],
  description: Option[String],
  banner: Option[String],
  premiumTier: PremiumTier,
  premiumSubscriptionCount: Option[Int],
  preferredLocale: String,
  publicUpdatesChannelId: Option[ULong]
)

sealed trait MessageNotificationLevel
object MessageNotificationLevel {
  case object AllMessages extends MessageNotificationLevel
  case object OnlyMentions extends MessageNotificationLevel
}

sealed trait ExplicitContentFilterLevel
object ExplicitContentFilterLevel {
  case object Disabled extends ExplicitContentFilterLevel
  case object MembersWithoutRoles extends ExplicitContentFilterLevel
  case object AllMembers extends ExplicitContentFilterLevel
}

sealed trait MfaLevel
object MfaLevel {
  case object None extends MfaLevel
  case object Elevated extends MfaLevel
}

sealed trait VerificationLevel
object VerificationLevel {
  case object None extends VerificationLevel
  case object Low extends VerificationLevel
  case object Medium extends VerificationLevel
  case object High extends VerificationLevel
  case object VeryHigh extends VerificationLevel
}

sealed trait PremiumTier
object PremiumTier {
  case object None extends PremiumTier
  case object Tier1 extends PremiumTier
  case object Tier2 extends PremiumTier
  case object Tier3 extends PremiumTier
}

sealed trait GuildFeature
object GuildFeature {
  case object InviteSplash extends GuildFeature
  case object VipRegions extends GuildFeature
  case object VanityUrl extends GuildFeature
  case object Verified extends GuildFeature
  case object Partnered extends GuildFeature
  case object Public extends GuildFeature
  case object Commerce extends GuildFeature
  case object News extends GuildFeature
  case object Discoverable extends GuildFeature
  case object Featurable extends GuildFeature
  case object AnimatedIcon extends GuildFeature
  case object Banner extends GuildFeature
  case object PublicDisabled extends GuildFeature
}

case class GuildOutbound(
  name: String,
  region: Option[String] = None,
  icon: Option[String] = None, // TODO
  verificationLevel: Option[VerificationLevel] = None,
  defaultMessageNotifications: Option[MessageNotificationLevel] = None,
  explicitContentFilter: Option[ExplicitContentFilterLevel] = None,
  roles: List[RoleOutbound] = List.empty,
  channels: List[ChannelOutbound] = List.empty,
  afkChannelId: Option[ULong] = None,
  afkTimeout: Option[Int] = None,
  systemChannelId: Option[ULong] = None
)

case class GuildPreview(
  id: ULong,
  name: String,
  icon: Option[String],
  splash: Option[String],
  discoverySplash: Option[String],
  emojis: List[Emoji],
  features: List[GuildFeature],
  approximateMemberCount: Int,
  approximatePresenceCount: Int,
  description: Option[String]
)

case class GuildPatch(
  name: Option[String] = None,
  region: Option[String] = None,
  verificationLevel: Option[VerificationLevel] = None,
  defaultMessageNotifications: Option[MessageNotificationLevel] = None,
  explicitContentFilter: Option[ExplicitContentFilterLevel] = None,
  afkChannelId: Option[ULong] = None,
  afkTimeout: Option[Int] = None,
  icon: Option[String] = None, // TODO
  ownerId: Option[ULong] = None,
  splash: Option[String] = None, // TODO
  banner: Option[String] = None, // TODO
  systemChannelId: Option[ULong] = None,
  rulesChannelId: Option[ULong] = None,
  publicUpdatesChannelId: Option[ULong] = None,
  preferredLocale: Option[String] = None
)

case class PruneCount(
  pruned: Int
)

case class PruneCountOutbound(
  days: Option[Int] = None
)

case class Prune(
  pruned: Option[Int]
)

case class PruneOutbound(
  days: Option[Int] = None,
  computePruneCount: Option[Boolean] = None
)

case class GuildEmbed(
  enabled: Boolean,
  channelId: Option[ULong]
)

case class GuildEmbedPatch(
  enabled: Option[Boolean] = None,
  channelId: Option[ULong] = None
)

sealed trait GuildWidgetStyle
object GuildWidgetStyle {
  case object Shield extends GuildWidgetStyle
  case object Banner1 extends GuildWidgetStyle
  case object Banner2 extends GuildWidgetStyle
  case object Banner3 extends GuildWidgetStyle
  case object Banner4 extends GuildWidgetStyle
}

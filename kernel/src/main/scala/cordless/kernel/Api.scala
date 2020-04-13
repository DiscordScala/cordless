package cordless.kernel

import cats.tagless.{autoInvariantK, finalAlg}
import cordless.model._
import spire.math.ULong

@finalAlg
@autoInvariantK
trait Api[F[_]] {

  def getChannel(id: F[ULong]): F[Channel]
  def modifyChannel(id: F[ULong], modification: F[ChannelPatch]): F[Channel]
  def deleteChannel(id: F[ULong]): F[Channel]
  def getChannelMessages(id: F[ULong], properties: F[MessageHistoryOutbound]): F[List[Message]]
  def getChannelMessage(channelId: F[ULong], messageId: F[ULong]): F[Message]
  def createMessage(id: F[ULong], properties: F[MessageOutbound]): F[Message]
  def createReaction(channelId: F[ULong], messageId: F[ULong], emoji: F[Emoji]): F[Unit]
  def deleteOwnReaction(channelId: F[ULong], messageId: F[ULong], emoji: F[Emoji]): F[Unit]
  def deleteUserReacton(channelId: F[ULong], messageId: F[ULong], emoji: F[Emoji], userId: F[ULong]): F[Unit]
  def getReactions(channelId: F[ULong], messageId: F[ULong], emoji: F[Emoji]): F[List[User]]
  def deleteAllReactions(channelId: F[ULong], messageId: F[ULong]): F[Unit]
  def deleteAllReactionsForEmoji(channelId: F[ULong], messageId: F[ULong], emoji: F[Emoji]): F[Unit]
  def editMessage(channelId: F[ULong], messageId: F[ULong], modification: F[MessagePatch]): F[Message]
  def deleteMessage(channelId: F[ULong], messageId: F[ULong]): F[Unit]
  def bulkDeleteMessages(channelId: F[ULong], messages: F[List[ULong]]): F[Unit]
  def editChannelPermissions(channelId: F[ULong], overwriteId: F[ULong]): F[Unit]
  def getChannelInvites(channelId: F[ULong]): F[List[Invite]]
  def createChannelInvite(channelId: F[ULong], properties: F[InviteOutbound]): F[Invite]
  def deleteChannelPermission(channelId: F[ULong], overwriteId: F[ULong]): F[Unit]
  def triggerTypingIndicator(channelId: F[ULong]): F[Unit]
  def getPinnedMessages(channelId: F[ULong]): F[List[Message]]
  def addPinnedChannelMessage(channelId: F[ULong], messageId: F[ULong]): F[Unit]
  def deletePinnedChannelMessage(channelId: F[ULong], messageId: F[ULong]): F[Unit]
  def groupDmAddRecipient(channelId: F[ULong], userId: F[ULong], properties: F[GroupDmRecipientOutbound]): F[Unit]
  def groupDmRemoveRecipient(channelId: F[ULong], userId: F[ULong]): F[Unit]

  def createGuild(properties: F[GuildOutbound]): F[Guild]
  def getGuild(id: F[ULong]): F[Guild]
  def getGuildPreview(id: F[ULong]): F[GuildPreview]
  def modifyGuild(id: F[ULong], modification: F[GuildPatch]): F[Guild]
  def deleteGuild(id: F[ULong]): F[Unit]
  def getGuildChannels(id: F[ULong]): F[List[Channel]]
  def createGuildChannel(id: F[ULong], properties: F[ChannelOutbound]): F[Channel]
  def modifyGuildChannelPositions(id: F[ULong], properties: F[List[(ULong, Int)]]): F[Unit]
  def getGuildMember(guildId: F[ULong], userId: F[ULong]): F[Member]
  def listGuildMembers(id: F[ULong], properties: F[MemberListOutbound]): F[List[Member]]
  def addGuildMember(guildId: F[ULong], userId: F[ULong], properties: F[MemberOutbound]): F[Either[Unit, Member]]
  def modifyGuildMember(guildId: F[ULong], userId: F[ULong], modification: F[MemberPatch]): F[Unit]
  def modifyCurrentUserNick(guildId: F[ULong], nick: F[String]): F[String]
  def addGuildMemberRole(guildId: F[ULong], userId: F[ULong], roleId: F[ULong]): F[Unit]
  def removeGuildMemberRole(guildId: F[ULong], userId: F[ULong], roleId: F[ULong]): F[Unit]
  def removeGuildMember(guildId: F[ULong], userId: F[ULong]): F[Unit]
  def getGuildBans(id: F[ULong]): F[List[Ban]]
  def getGuildBan(guildId: F[ULong], userId: F[ULong]): F[Option[Ban]]
  def createGuildBan(guildId: F[ULong], userId: F[ULong], properties: F[BanOutbound]): F[Unit]
  def removeGuildBan(guildId: F[ULong], userId: F[ULong]): F[Unit]
  def getGuildRoles(id: F[ULong]): F[List[Role]]
  def createGuildRole(id: F[ULong], properties: F[RoleOutbound]): F[Role]
  def modifyGuildRolePositions(id: F[ULong], properties: F[List[(ULong, Int)]]): F[List[Role]]
  def modifyGuildRole(guildId: F[ULong], roleId: F[ULong], modification: F[RolePatch]): F[Role]
  def deleteGuildRole(guildId: F[ULong], roleId: F[ULong]): F[Unit]
  def getGuildPruneCount(guildId: F[ULong], properties: F[PruneCountOutbound]): F[PruneCount]
  def beginGuildPrune(guildId: F[ULong], properties: F[PruneOutbound]): F[Prune]
  def getGuildVoiceRegions(guildId: F[ULong]): F[List[VoiceRegion]]
  def getGuildInvites(guildId: F[ULong]): F[List[Invite]]
  def getGuildIntegrations(guildId: F[ULong]): F[List[Integration]]
  def createGuildIntegration(guildId: F[ULong], properties: F[IntegrationOutbound]): F[Unit]
  def modifyGuildIntegration(guildId: F[ULong], integrationId: F[ULong], modification: F[IntegrationPatch]): F[Unit]
  def deleteGuildIntegration(guildId: F[ULong], integrationId: F[ULong]): F[Unit]
  def syncGuildIntegration(guildId: F[ULong], integrationId: F[ULong]): F[Unit]
  def getGuildEmbed(id: F[ULong]): F[GuildEmbed]
  def modifyGuildEmbed(id: F[ULong], modification: F[GuildEmbedPatch]): F[GuildEmbed]
  def getGuildVanityUrl(id: F[ULong]): F[Invite]
  def getGuildWidgetImage(id: F[ULong], style: F[GuildWidgetStyle]): F[String] // TODO

  def getVoiceRegions: F[List[VoiceRegion]]

}

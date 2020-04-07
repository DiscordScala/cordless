package cordless.model

import java.time.ZonedDateTime
import spire.math.ULong

case class Message(
  id: ULong,
  channelId: ULong,
  guildId: Option[ULong],
  author: Either[Webhook, User],
  member: Option[Member],
  content: String,
  timestamp: ZonedDateTime,
  editedTimestamp: ZonedDateTime,
  tts: Boolean,
  mentionEveryone: Boolean,
  mentions: List[Member],
  mentionRoles: List[ULong],
  mentionChannels: Option[List[ULong]],
  attachments: List[Attachment],
  embeds: List[Embed],
  reactions: Option[List[Reaction]],
  nonce: Option[ULong],
  pinned: Boolean,
  webhookId: Option[ULong],
  tpe: MessageType,
  activity: Option[MessageActivity],
  application: Option[MessageApplication],
  messageReference: Option[MessageReference],
  flags: Option[Int]
)

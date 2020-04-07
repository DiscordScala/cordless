package cordless.model

import spire.math.ULong

case class User(
  id: ULong,
  username: String,
  discriminator: String,
  avatar: Option[String],
  bot: Option[Boolean],
  system: Option[Boolean],
  mfaEnabled: Option[Boolean],
  locale: Option[String],
  verified: Option[Boolean],
  email: Option[String],
  flags: Option[Int],
  premiumType: Option[Int]
)

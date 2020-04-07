package cordless.model

import spire.math.ULong

case class Emoji(
  id: Option[ULong],
  name: Option[String],
  roles: Option[List[ULong]],
  user: Option[User],
  requireColons: Option[Boolean],
  managed: Option[Boolean],
  animated: Option[Boolean],
  available: Option[Boolean]
)

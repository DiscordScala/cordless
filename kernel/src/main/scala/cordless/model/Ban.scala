package cordless.model

case class Ban(
  reason: Option[String],
  user: User
)

case class BanOutbound(
  deleteMessageDays: Option[Int] = None,
  reason: Option[String] = None
)

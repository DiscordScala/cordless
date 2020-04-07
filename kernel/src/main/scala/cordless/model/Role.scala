package cordless.model

import spire.math.ULong

case class Role(
  id: ULong,
  name: String,
  color: Int,
  hoist: Boolean,
  position: Int,
  permissions: Int,
  managed: Boolean,
  mentionable: Boolean
)

case class RoleOutbound(
  name: Option[String] = None,
  permissions: Option[Int] = None,
  color: Option[Int] = None,
  hoist: Option[Boolean] = None,
  mentionable: Option[Boolean] = None
)

case class RolePatch(
  name: Option[String] = None,
  permissions: Option[Int] = None,
  color: Option[Int] = None,
  hoist: Option[Boolean] = None,
  mentionable: Option[Boolean] = None
)

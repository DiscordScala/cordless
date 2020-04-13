package cordless

import cats.effect.{Resource, Sync}
import cats.tagless._
import org.http4s.client.{Client => Http}
import org.http4s.client.jdkhttpclient.{WSClient => Ws}

@finalAlg
@autoInvariantK
trait Discord[F[_]] extends kernel.Api[F] {

  def gateway: Discord.GW[F]

  def login(gateway: Discord.GW[F]): F[Unit]

}

object Discord {

  private type GW[F[_]] = F[Resource[F, kernel.Gateway[fs2.Stream[F, *]]]]

  def apply[F[_]](token: String, http: Http[F], ws: Ws[F])(implicit s: Sync[F]): Discord[F] = ???

}

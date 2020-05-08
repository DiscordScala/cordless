package cordless

import cats.effect.{Resource, Sync}
import cats.tagless._
import fs2._
import org.http4s.client.{Client => Http}
import org.http4s.client.jdkhttpclient.{WSClient => Ws}

@finalAlg
@autoInvariantK
trait Discord[F[_]] extends kernel.Api[F] with kernel.Gateway[Stream[F, *]]

object Discord {

  def apply[F[_]](token: String, http: Http[F], ws: Ws[F])(implicit sync: Sync[F]): Resource[F, Discord[F]] = ???

}

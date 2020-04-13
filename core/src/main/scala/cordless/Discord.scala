package cordless

import cats.effect.{Resource, Sync}
import org.http4s.client.{Client => Http}
import org.http4s.client.jdkhttpclient.{WSClient => Ws}

trait Discord[F[_]] {

  def api: F[kernel.Api[F]]
  def gateway: F[Resource[F, kernel.Gateway[fs2.Stream[F, *]]]]

}

object Discord {

  def apply[F[_]](token: String)(http: Http[F], ws: Ws[F])(s: Sync[F]): Discord[F] = ???

}

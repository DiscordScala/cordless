package cordless

import cats.effect.{ExitCode, IO, IOApp, Sync}
import cats.implicits._
import scala.io.StdIn

object Test extends IOApp {

  def token[F[_]](args: List[String])(implicit s: Sync[F]): F[String] =
    s.delay(StdIn.readLine("Token? "))

  def program[F[_]](implicit d: Discord[F]): F[Unit] = {
    d.login(d.gateway)
  }

  override def run(args: List[String]): IO[ExitCode] = {
    (token[IO](args) map
      (Discord[IO](_, ???, ???)) >>=
      (program[IO](_))
    ) as ExitCode.Success
  }

}

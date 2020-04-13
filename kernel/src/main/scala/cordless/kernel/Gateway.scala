package cordless.kernel

import cats.tagless._

@finalAlg
@autoInvariantK
trait Gateway[S[_]] {

  def send(outGoing: S[Event]): S[Unit]
  def receive: S[Event]

}

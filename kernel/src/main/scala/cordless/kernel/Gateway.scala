package cordless.kernel

trait Gateway[S[_]] {

  def send(outGoing: S[Event]): S[Unit]
  def receive: S[Event]

}

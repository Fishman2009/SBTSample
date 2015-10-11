import akka.actor.ActorSystem
import akka.actor.Props

object MyActorSystem {

  def main(args: Array[String]): Unit = {
    val _system = ActorSystem("BecomeUnbecome")
    val pingPongActor = _system.actorOf(Props[PingPongActor])
    pingPongActor ! PING
    Thread.sleep(20000)
    _system.shutdown
  }
}
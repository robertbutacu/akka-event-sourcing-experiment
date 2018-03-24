package car.parts

import akka.persistence.PersistentActor

class WaterTemperatureActor(id: String) extends PersistentActor{
  override def receiveRecover: Receive = ???

  override def receiveCommand: Receive = ???

  override def persistenceId: String = id
}

package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example11 extends AggregateProgram with StandardSensors with BlockG {

  override def main(): Any = {
    branch(!sense[Boolean]("obstacle")){
      channel(sense("source"), sense("destination"), 0.2)
    } {
      false
    }
  }

}

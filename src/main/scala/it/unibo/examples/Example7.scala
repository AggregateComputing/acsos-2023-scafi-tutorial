package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example7 extends AggregateProgram with StandardSensors {
  // branching operator to create non communicating branches
  override def main(): Any = branch(sense[Boolean]("zone")) {
    0
  } {
    foldhood(0)(_ + _)(nbr(1))
  }
}

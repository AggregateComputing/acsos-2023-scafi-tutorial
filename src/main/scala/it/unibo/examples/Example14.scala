package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example14 extends AggregateProgram with StandardSensors with BlockS with BlockG with BlockC {
  override def main(): Any = {
    val leader = S2(3)
    val potential = classicGradient(leader)
    val nodes = C[Double, Int](potential, _ + _, 1, 0)
    broadcast(leader, nodes > 10)
  }
}

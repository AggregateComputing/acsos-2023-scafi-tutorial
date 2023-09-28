package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example13 extends AggregateProgram with StandardSensors with BlockS {
  // Sparse choice, i.e., distributed leader election
  override def main(): Any = S2(3)
}

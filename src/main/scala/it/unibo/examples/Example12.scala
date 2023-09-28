package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example12 extends AggregateProgram with StandardSensors with BlockC with BlockG {
  // Collect cast: accumulate a value towards sink nodes
  override def main(): Any = {
    val potentialField = classicGradient(sense("sink"))
    C[Double, Double](potentialField, _ + _, 1, 0)
  }

}

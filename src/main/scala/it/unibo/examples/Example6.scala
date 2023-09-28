package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example6 extends AggregateProgram {
  // Local state evolution, through rep
  override def main(): Any = rep(0){ _ + 1 }
}

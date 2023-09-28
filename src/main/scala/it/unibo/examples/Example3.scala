package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example3 extends AggregateProgram {
  override def main(): Any = mid() // function call => produce a field composed of nodes' id
}

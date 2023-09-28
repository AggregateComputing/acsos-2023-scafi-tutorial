package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example4 extends AggregateProgram {
  override def main(): Any = sense[Boolean]("source") // input from environment via sensing
}

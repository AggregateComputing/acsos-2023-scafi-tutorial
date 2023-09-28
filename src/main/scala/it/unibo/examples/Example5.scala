package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example5 extends AggregateProgram {
  // Integration with the neighborhood, through nbr (neighborhood read+write) and foldhood
  override def main(): Any = foldhoodPlus(0)((a,b) => a + b)(nbr(1))
}

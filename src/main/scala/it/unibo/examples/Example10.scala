package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example10 extends AggregateProgram with StandardSensors with BlockG {
  // Channel example, it links two area of the network
  def selfOrgChannel(source: Boolean, target: Boolean, width: Double): Boolean = {
    classicGradient(source) + classicGradient(target) <= distanceBetween(source, target) + width
  }
  override def main(): Any = {
    selfOrgChannel(sense("source"), sense("destination"), 0.2)
  }

}

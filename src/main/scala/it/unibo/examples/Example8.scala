package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example8 extends AggregateProgram with StandardSensors {
  // Spatio-temporal structure -- self-org gradient
  override def main(): Any = rep(Double.PositiveInfinity)(distance =>
    mux(sense[Boolean]("source")) {
      0.0
    } {
      minHoodPlus(nbr(distance) + nbrRange)
    }
  )
}

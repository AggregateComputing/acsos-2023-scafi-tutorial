package it.unibo.examples

import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._

class Example9 extends AggregateProgram with StandardSensors {
  // Gradient with obstacles
  def gradient: Double = rep(Double.PositiveInfinity)(distance =>
    mux(sense[Boolean]("source")) {
      0.0
    } {
      minHoodPlus(nbr(distance) + nbrRange)
    }
  )
  override def main(): Any = branch(!sense[Boolean]("obstacle"))(gradient)(Double.PositiveInfinity)
}

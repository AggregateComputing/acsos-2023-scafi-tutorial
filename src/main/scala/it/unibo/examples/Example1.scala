package it.unibo.examples
// PROGRAMMING IN SCAFI
// 1. Select the incarnation
import it.unibo.alchemist.model.scafi.ScafiIncarnationForAlchemist._
// 2. define your class name with including several libraries
// Simple example: return a constant value (a field)
class Example1 extends AggregateProgram {
  override def main(): Int = 22 // 3. define the main class of the aggregate computing script
}

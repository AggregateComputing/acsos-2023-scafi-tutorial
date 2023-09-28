# ScaFi -- ACSOS 2023 Tutorial


## Prerequisites

A [Gradle-compatible Java version](https://docs.gradle.org/current/userguide/compatibility.html).

## How to launch

Simulations can be included in the `src/main/yaml` folder,
and executed via the `runAll` Gradle task.

In this tutorial we provide different simulations to show the main operator of ScaFi.
For each YAML file in `src/main/yaml` a task `runFileName` will be created.

In order to launch, open a terminal and move to the project root folder, then on UNIX:
```bash
./gradlew runAll
```
On Windows:
```
gradlew.bat runAll
```

Press <kb>P</kb> to start the simulation.
For further information about the gui, see the [Alchemist documentation](https://alchemistsimulator.github.io/).

Note that the first launch will take some time, since Gradle will download all the required files.
They will get cached in the user's home folder (as per Gradle normal behavior).

## Today tutorial
The main goal of this tutorial is to showcase how to program in ScaFi leveraging the Alchemist 
simulator. 
We will start from the basics, and then we will move to more advanced topics
(like self-organising gradient and self-healing channel).
The examples are in the folder `it.unibo.examples`

## Advanced pointers
- MacroSwarm: https://github.com/AggregateComputing/experiment-2023-coordination-swarm-behaviour
- Field Informed RL: https://github.com/AggregateComputing/experiment-2023-acsos-field-informed-rl
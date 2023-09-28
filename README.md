# ScaFi -- ACSOS 2023 Tutorial


## Prerequisites

* a [Gradle-compatible Java version](https://docs.gradle.org/current/userguide/compatibility.html).

## How to launch

First of all, clone the repository

```bash
git clone git@github.com:AggregateComputing/acsos-2023-scafi-tutorial.git
```

Simulations can be included in the `src/main/yaml` folder,
and executed via the `runAll` Gradle task.
You can also run `./gradlew tasks` to show available tasks.

To **start** a simulation (`./gradlew runExample<N>`) once the graphical user interface appears, press key **`P`** and use the mouse and mouse wheel to move/resize the graphical representation of the system.

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

## Examples

```./gradlew runExample<N>```
(where `<N>` is a number)

then, to **start** the simulation, press **`P`**.

* **Example 1**: constant value
* **Example 2**: constant expression
* **Example 3**: sensor access (static value)
* **Example 4**: sensor access (usually dynamic)
* **Example 5**: sharing data with neighbours
* **Example 6**: stateful transformation (round counting)
* **Example 7**: branch to create non-communicating subcomputations
* **Example 8**: self-healing gradient algorithm 
* **Example 9**: gradient with obstacles + functional abstraction
* **Example 10**: self-healing channel
* **Example 11**: channel with obstacles
* **Example 12**: information collection into a sink
* **Example 13**: sparse choice (leader election)
* **Example 14**: SGCG block, aka Self-organising Coordination Regions (SCR) pattern 


## Alchemist usage

Here are some [key commands](http://alchemistsimulator.github.io/reference/swing/) to interact with a running simulation. 

- **`p`** to start (or pause) a simulation
- **`l`** to show/hide links
- **`s`** to enter/exit in "select mode", useful to move devices with **`o`** + drag&drop.
- **double click** on a node to see its state (**`m`** to show/hide node marker)

## Today tutorial
The main goal of this tutorial is to showcase how to program in ScaFi leveraging the Alchemist 
simulator. 
We will start from the basics, and then we will move to more advanced topics
(like self-organising gradient and self-healing channel).
The examples are in the folder `it.unibo.examples`

## Advanced pointers
- MacroSwarm: https://github.com/AggregateComputing/experiment-2023-coordination-swarm-behaviour
- Field Informed RL: https://github.com/AggregateComputing/experiment-2023-acsos-field-informed-rl
# Strategy Calculator

Assignment 5, Software Design Patterns. Java 17 console application demonstrating
addition, subtraction and multiplication through the Strategy pattern.

## Build and run

Install JDK 17 and run these commands from the project folder:

```sh
javac --release 17 -d out src/calculator/*.java
java -cp out calculator.Main
```

In IntelliJ IDEA, open this folder, select JDK 17 as the Project SDK, mark `src`
as Sources Root if needed, and run `Main.main()`.

Expected output:

```text
12.0 + 4.0 = 16.0
12.0 - 4.0 = 8.0
12.0 * 4.0 = 48.0
```

The same `Calculator` object changes its strategy twice during this single run.
No external libraries or build tools are required.

## Structure

```text
src/calculator/
  CalculationStrategy.java   Common algorithm interface
  AddStrategy.java           Addition
  SubtractStrategy.java      Subtraction
  MultiplyStrategy.java      Multiplication
  Calculator.java            Context: stores and calls a strategy
  Main.java                  Client: selects and switches strategies
REPORT.md                    Reflection and UML class diagram
DEFENSE_RU.md                Short explanation for the oral defense
```

## Add a strategy

Create a class in package `calculator` that implements `CalculationStrategy`
and its `execute(double first, double second)` method. Pass its instance to the
`Calculator` constructor or `setStrategy(...)` in a client.
The interface, context and existing strategies require no changes.
Section 3.5 of [the report](REPORT.md) gives a complete extension example with
a separate client, so even `Main` can remain unchanged.

## Project notes

- Strategies calculate a result; only the client prints it.
- The context rejects a null strategy and contains no strategy-type conditions.
- Inputs and results use Java `double` arithmetic.
- [Report](REPORT.md) includes five Clean Code principles and Strategy vs. State.

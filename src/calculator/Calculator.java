package calculator;

import java.util.Objects;

public class Calculator {
    private CalculationStrategy strategy;

    public Calculator(CalculationStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public double calculate(double first, double second) {
        return strategy.execute(first, second);
    }
}

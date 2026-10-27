package calculator;

public class SubtractStrategy implements CalculationStrategy {
    @Override
    public double execute(double first, double second) {
        return first - second;
    }
}

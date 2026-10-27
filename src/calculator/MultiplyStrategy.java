package calculator;

public class MultiplyStrategy implements CalculationStrategy {
    @Override
    public double execute(double first, double second) {
        return first * second;
    }
}

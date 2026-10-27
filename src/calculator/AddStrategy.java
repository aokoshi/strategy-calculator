package calculator;

public class AddStrategy implements CalculationStrategy {
    @Override
    public double execute(double first, double second) {
        return first + second;
    }
}

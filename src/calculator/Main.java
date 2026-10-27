package calculator;

public class Main {
    public static void main(String[] args) {
        double first = 12;
        double second = 4;

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println(first + " + " + second + " = " + calculator.calculate(first, second));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println(first + " - " + second + " = " + calculator.calculate(first, second));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println(first + " * " + second + " = " + calculator.calculate(first, second));
    }
}

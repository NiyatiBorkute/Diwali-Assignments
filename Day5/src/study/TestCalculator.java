package study;
import study.WrongOperatorException; // Needed if exception class is public

public class TestCalculator {
    public static void main(String[] args) {
        try {
            int result1 = Calculator.calculate(10, 5, "+");
            System.out.println("Addition: " + result1);

            int result2 = Calculator.calculate(10, 5, "-");
            System.out.println("Subtraction: " + result2);

            int result3 = Calculator.calculate(10, 5, "*");
            System.out.println("Multiplication: " + result3);

            int result4 = Calculator.calculate(10, 5, "/");
            System.out.println("Division: " + result4);

            int result5 = Calculator.calculate(10, 5, "%");
            System.out.println("Modulo: " + result5);

            // Invalid operator (will throw custom exception)
            int result6 = Calculator.calculate(10, 5, "^");
            System.out.println("Result: " + result6);

        } catch (WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        }
    }
}

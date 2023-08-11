package se.lexicon;

/**
 * Basic calculator with Interface
 *
 */
public class App {
    public static void main(String[] args) {
        // Create a calculator instance
        Calculator calculator = new BasicCalculator();

        // Get input from the user
        double num1 = Calculator.getInput("Enter first number: ");
        double num2 = Calculator.getInput("Enter second number: ");
        char operator = Calculator.getOperator();

        // Calculate and display the result
        double result = calculator.calculate(num1, num2, operator);
        System.out.println("Result: " + result);
    }
}
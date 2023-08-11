package se.lexicon;

import java.util.Scanner;

// Define the Calculator interface
interface Calculator {
    // Abstract methods for arithmetic operations
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);

    // Default method for calculation
    default double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    // Static helper methods for taking input from the user
    static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    static char getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }
}

// Implement the Calculator interface
class BasicCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Step 1: Declare Variables
        String operator = "*";
        double num1 = 10;
        double num2 = 5;
        double result;

        // Step 2: Perform Operation
        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("The quotient is: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator.");
        }

    }
}

package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Step 1: Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Capture Boolean Inputs
        System.out.println("Are you thirsty? (true/false)");
        boolean isThirsty = scanner.nextBoolean();

        System.out.println("Are you sleepy? (true/false)");
        boolean isSleepy = scanner.nextBoolean();

        // Step 3: Determine the Drink
        String drink;
        if (isThirsty && !isSleepy) {
            drink = "water";
        } else if (isThirsty && isSleepy) {
            drink = "coffee";
        } else if (!isThirsty && isSleepy) {
            drink = "tea";
        } else {
            drink = "nothing";
        }

        // Step 4: Print the Drink Suggestion
        System.out.println("Looks like you need to drink " + drink);

        // Close the scanner object
        scanner.close();
    }
}

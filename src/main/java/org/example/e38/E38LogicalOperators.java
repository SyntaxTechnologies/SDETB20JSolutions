package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Step 1: Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Capture Boolean Inputs
        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend = scanner.nextBoolean();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable = scanner.nextBoolean();

        // Step 3: Determine the Subject
        String subject;
        if (isAvailable) {
            if (isWeekend) {
                subject = "Java";
            } else {
                subject = "manual testing";
            }
        } else {
            subject = "no subject";
        }

        // Step 4: Print the Subject
        System.out.println("Today you will be learning " + subject);

        // Close the scanner object
        scanner.close();


    }
}

package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Step 1: Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Check Loan Requirement
        System.out.println("Do you need a loan? (true/false)");
        boolean needsLoan = scanner.nextBoolean();

        // Initialize eligibility
        String eligibility;

        // Step 3: Check Credit Score
        if (needsLoan) {
            System.out.println("What is your credit score?");
            int creditScore = scanner.nextInt();

            // Step 4: Determine Eligibility
            if (creditScore < 600) {
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore <= 800) {
                eligibility = "Eligible";
            } else if (creditScore > 800) {
                eligibility = "Definitely eligible";
            } else {
                eligibility = "Unknown";
            }
        } else {
            eligibility = "Unknown";
        }

        // Step 5: Print Eligibility
        System.out.println("The eligibility is " + eligibility);

        // Close the scanner object
        scanner.close();




    }
}

package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {
        // Step 1: Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Capture Monthly Expenses
        System.out.println("Please enter your monthly rent expense");
        double rentExpense = scanner.nextDouble();

        System.out.println("Please enter your monthly food expense");
        double foodExpense = scanner.nextDouble();

        System.out.println("Please enter your monthly transportation expense");
        double transportationExpense = scanner.nextDouble();

        System.out.println("Please enter your monthly entertainment expense");
        double entertainmentExpense = scanner.nextDouble();

        // Step 3: Analyze Expenses
        if (rentExpense > foodExpense && transportationExpense > entertainmentExpense) {
            System.out.println("You are prioritizing essentials well.");
        } else if (rentExpense > foodExpense || transportationExpense > entertainmentExpense) {
            System.out.println("You are on the right track, but could improve.");
        } else {
            System.out.println("You need to rethink your spending priorities.");
        }

        // Close the scanner object
        scanner.close();


    }
}

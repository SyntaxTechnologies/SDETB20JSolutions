package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Step 1: Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Capture Marks Input
        System.out.println("Please enter your mark");
        int marks = scanner.nextInt();

        // Step 3: Determine the Grade
        String grade;
        if (marks >= 1 && marks <= 25) {
            grade = "F";
        } else if (marks >= 26 && marks <= 45) {
            grade = "E";
        } else if (marks >= 46 && marks <= 50) {
            grade = "D";
        } else if (marks >= 51 && marks <= 60) {
            grade = "C";
        } else if (marks >= 61 && marks <= 80) {
            grade = "B";
        } else if (marks > 80 && marks <= 100) {
            grade = "A";
        } else {
            grade = "Please enter a valid mark";
        }

        // Step 4: Print the Grade
        if (grade.equals("Please enter a valid mark")) {
            System.out.println(grade);
        } else {
            System.out.println("Your grade is " + grade);
        }

        // Close the scanner object
        scanner.close();


    }
}

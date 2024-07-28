package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Step 1: Declare Variables
        int score = 85;

        // Step 2: Calculate Grade
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        } else {
            grade = "Invalid score";
        }

        // Print the letter grade
        System.out.println("Your grade is: " + grade);
    }
}
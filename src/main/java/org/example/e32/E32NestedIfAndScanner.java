package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Step 1: Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Capture Gender Information
        System.out.println("Please enter your gender: M or F");
        String gender = scanner.next();

        // Step 3: Capture Age Information
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        // Step 4: Classify Based on Gender and Age
        if (age > 25) {
            if (gender.equalsIgnoreCase("F")) {
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        } else {
            if (gender.equalsIgnoreCase("F")) {
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
            }
        }

        // Close the scanner object
        scanner.close();



    }
}

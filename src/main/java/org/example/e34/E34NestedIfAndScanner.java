package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Step 1: Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Capture Three Numbers
        System.out.println("Please enter 3 distinct numbers separated by spaces");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Step 3: Find the Largest Number
        int largest;

        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        // Print the largest number
        System.out.println("The largest number is " + largest);

        // Close the scanner object
        scanner.close();

    }
}

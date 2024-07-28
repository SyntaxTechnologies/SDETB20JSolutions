package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Step 1: Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Capture Instructor Name
        System.out.println("Enter name of the instructor");
        String instructorName = scanner.nextLine();

        // Step 3: Determine Responsibility
        String responsibility;

        switch (instructorName) {
            case "Asghar":
                responsibility = "Will take care of Java Assignment";
                break;
            case "Moazzam":
                responsibility = "Will take care of SDLC Assignment";
                break;
            case "Weqas":
                responsibility = "Will take care of Selenium Assignment";
                break;
            case "Asel":
                responsibility = "Will take care of every Assignment";
                break;
            default:
                responsibility = "Invalid instructor selected";
                break;
        }

        // Step 4: Print the Responsibility
        System.out.println(responsibility);

        // Close the scanner object
        scanner.close();


    }
}

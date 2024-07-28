package org.example.e15;

public class E15TimeConversionModulus {
    public static void main(String[] args) {
        // Step 1: Create Variables
        int totalMinutes = 125;

        // Step 2: Calculate Hours and Minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Step 3: Print the Results
        System.out.println(totalMinutes + " minutes is equal to " + hours + " hours and " + minutes + " minutes.");
    }
}

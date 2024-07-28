package org.example.e16;

public class E16DistanceConversionModulus {
    public static void main(String[] args) {
        // Step 1: Create Variables
        int totalMeters = 1850;

        // Step 2: Calculate Kilometers and Meters
        int kilometers = totalMeters / 1000;
        int meters = totalMeters % 1000;

        // Step 3: Print the Results
        System.out.println(totalMeters + " meters is equal to " + kilometers + " kilometers and " + meters + " meters.");
    }
}

package org.example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Step 1: Create Variables
        int totalSlices = 13;
        int friends = 4;

        // Step 2: Calculate Slices per Person
        int slicesPerPerson = totalSlices / friends;
        int leftoverSlices = totalSlices % friends;

        // Step 3: Print the Results
        System.out.println("Each person gets " + slicesPerPerson + " slices.");
        System.out.println("There are " + leftoverSlices + " slices left over.");

    }
}

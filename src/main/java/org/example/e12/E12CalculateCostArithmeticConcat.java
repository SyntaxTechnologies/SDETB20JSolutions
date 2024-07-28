package org.example.e12;

public class E12CalculateCostArithmeticConcat {
    public static void main(String[] args) {
        // Step 1: Declare Variables
        float item1 = 15.5f;
        float item2 = 23.0f;
        float item3 = 9.99f;
        float item4 = 27.49f;

        // Step 2: Perform Operations
        float totalCost = item1 + item2 + item3 + item4;
        float averageCost = totalCost / 4;

        // Step 3: Print Values
        System.out.println("The total cost is " + totalCost);
        System.out.println("The average cost is " + averageCost);
    }
}

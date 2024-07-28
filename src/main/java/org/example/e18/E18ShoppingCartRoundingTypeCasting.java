package org.example.e18;

public class E18ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        // Step 1: Create Variables
        double item1 = 19.99;
        double item2 = 29.75;
        double item3 = 4.99;

        // Step 2: Calculate Total Cost
        double totalCost = item1 + item2 + item3;

        // Step 3: Round Off Total Cost
        int roundedCost = (int) totalCost;

        // Step 4: Print the Results
        System.out.println("The original total cost is $" + totalCost);
        System.out.println("The rounded total cost is $" + roundedCost);

    }
}

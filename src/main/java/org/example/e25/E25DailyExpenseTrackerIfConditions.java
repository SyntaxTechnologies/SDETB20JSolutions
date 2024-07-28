package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Step 1: Assign Daily Expenses
        double morningExpense = 25.5;
        double afternoonExpense = 30.75;
        double eveningExpense = 20.0;

        // Step 2: Calculate Total Expense
        double totalExpense = morningExpense + afternoonExpense + eveningExpense;

        // Step 3: Check if Within Budget
        double budget = 100.0;

        // Step 4: Print the Results
        System.out.println("Your total daily expense is: " + totalExpense);
        if (totalExpense <= budget) {
            System.out.println("You are within the budget.");
        } else {
            System.out.println("You are over the budget.");
        }


    }
}

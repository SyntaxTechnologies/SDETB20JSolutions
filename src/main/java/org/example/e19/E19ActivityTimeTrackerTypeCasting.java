package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {
        // Step 1: Create Variables
        double activity1 = 45.5;
        double activity2 = 30.2;
        double activity3 = 60.7;

        // Step 2: Calculate Total Time
        double totalTime = activity1 + activity2 + activity3;

        // Step 3: Convert Total Time to Hours and Minutes
        int totalMinutes = (int) totalTime;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Step 4: Print the Results
        System.out.println("The original total time is " + totalTime + " minutes.");
        System.out.println("The converted time is " + hours + " hours and " + minutes + " minutes.");
    }
}

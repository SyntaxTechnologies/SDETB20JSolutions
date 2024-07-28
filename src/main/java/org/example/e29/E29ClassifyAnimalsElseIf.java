package org.example.e29;

public class E29ClassifyAnimalsElseIf {
    public static void main(String[] args) {
        // Step 1: Declare a Variable
        String animal = "dog";

        // Step 2: Classify the Animal
        if (animal.equals("dog")) {
            System.out.println("The animal is a mammal.");
        } else if (animal.equals("eagle")) {
            System.out.println("The animal is a bird.");
        } else if (animal.equals("shark")) {
            System.out.println("The animal is a fish.");
        } else if (animal.equals("frog")) {
            System.out.println("The animal is an amphibian.");
        } else if (animal.equals("snake")) {
            System.out.println("The animal is a reptile.");
        } else {
            System.out.println("Unknown animal type.");
        }

    }
}
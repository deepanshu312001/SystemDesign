// Client.java
package com.example.builder;

// Client code demonstrating the Builder pattern
public class Client {
    public static void main(String[] args) {
        // Create a director
        MealDirector mealDirector = new MealDirector();

        // Create a veg meal using the VegMealBuilder
        MealBuilder vegMealBuilder = new VegMealBuilder();
        Meal vegMeal = mealDirector.constructMeal(vegMealBuilder);

        // Display the contents and cost of the veg meal
        System.out.println("Veg Meal:");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        // Create a non-veg meal using the NonVegMealBuilder
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();
        Meal nonVegMeal = mealDirector.constructMeal(nonVegMealBuilder);

        // Display the contents and cost of the non-veg meal
        System.out.println("\nNon-Veg Meal:");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}

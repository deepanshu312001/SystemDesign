// MealDirector.java
package com.example.builder;

// Director class for constructing meals using a builder
public class MealDirector {
    public Meal constructMeal(MealBuilder mealBuilder) {
        mealBuilder.buildBurger();
        mealBuilder.buildColdDrink();
        return mealBuilder.getMeal();
    }
}


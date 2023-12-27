// NonVegMealBuilder.java
package com.example.builder;

// Concrete builder implementing MealBuilder for creating non-veg meals
public class NonVegMealBuilder implements MealBuilder {
    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildColdDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}


// MealBuilder.java
package com.example.builder;

// Builder interface for creating meals
public interface MealBuilder {
    void buildBurger();
    void buildColdDrink();
    Meal getMeal();
}

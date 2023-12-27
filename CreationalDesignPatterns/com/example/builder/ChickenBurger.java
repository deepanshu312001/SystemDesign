// ChickenBurger.java
package com.example.builder;

// Concrete class extending Burger representing a chicken burger
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}

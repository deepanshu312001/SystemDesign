// VegBurger.java
package com.example.builder;

// Concrete class extending Burger representing a veg burger
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

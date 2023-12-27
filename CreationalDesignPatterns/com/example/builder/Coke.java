// Coke.java
package com.example.builder;

// Concrete class extending ColdDrink representing a coke
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}

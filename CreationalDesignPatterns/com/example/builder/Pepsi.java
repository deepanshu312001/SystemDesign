// Pepsi.java
package com.example.builder;

// Concrete class extending ColdDrink representing a pepsi
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}

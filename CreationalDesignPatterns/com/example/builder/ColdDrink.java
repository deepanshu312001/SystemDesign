// ColdDrink.java
package com.example.builder;

// Concrete class implementing the Item interface for cold drinks
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
